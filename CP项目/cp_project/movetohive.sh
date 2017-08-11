#!/bin/bash

#===============================================================================
#将hadoop中的文件移动到hive中
#===============================================================================

#flume采集的数据存放的目录
log_flume_dir=/docker_messages/cplog
#flume预处理的存放目录，
log_pre_input=/docker_messages/cplog_pre

#获取时间信息
#拿到昨天是几年几月几日
day_01=`date -d"$1 day" +%Y%m%d`
#分别拿到昨日的年月日信息
syear=`date --date=$day_01 +%Y`
smonth=`date --date=$day_01 +%m`
sday=`date --date=$day_01 +%d`

#读取日志文件的目录
files=`hadoop fs -ls $log_flume_dir | grep $day_01 | wc -l`
echo $files
#如果有这一天的文件，files将会大于0
if [ $files -gt 0 ];then
#向建立的外部表里面添加一天的数据

HQL_PRE="alter table cp_project.cp_origin_external drop if exists partition (date='$day_01');alter table cp_project.cp_origin_external add partition

(date='$day_01') location '/docker_messages/cplog/$day_01'"
echo HQL_PRE
/usr/bin/hive -e "$HQL_PRE"


#将添加的当天数据中含有ms:cp的字符串的行过滤到cplog_pre文件夹下面
HQL_CP="insert overwrite directory '/docker_messages/cplog_pre/$day_01' select line from cp_project.cp_origin_external where date='$day_01' and instr(line,'ms:cp')>0"
echo $HQL_CP
/usr/bin/hive -e "$HQL_CP"
echo "success process ${log_flume_dir}/${day_01} to ${log_pre_input}"
fi


#===============================================================================
#将hadoop中预处理目录中的日志加载到hive表
#===============================================================================
#目标hive表

cp_origin_log="cp_project.cp_origin_log"
cp_uuid_log="cp_project.cp_uuid_log"

t_cp_session="cp_project.t_cp_session"
t_cp_platform="cp_project.t_cp_platform"
t_cp_provider="cp_project.t_cp_provider"

#1用来解析json的jar
json_ser_jar="/var/lib/hadoop-hdfs/udf/json-serde-1.3.7-jar-with-dependencies.jar"
#用来解析log字段的udfjar包
cp_udf_jar="/var/lib/hadoop-hdfs/udf/cp-1.0-SNAPSHOT.jar"
#添加用到的jar包
HQL_ADD_JAR="add jar $json_ser_jar;add jar $cp_udf_jar"





#2自定义的udf函数
UDF_CLASS="cn.com.pateo.cpETL.LogToField"
HQL_UDF="create temporary function logToField as '$UDF_CLASS'"
echo $HQL_UDF





#3导入原始数据到cp_project.cp_origin_log
HQL_ORIGIN="$HQL_ADD_JAR;load data inpath '$log_pre_input/$day_01' overwrite into table $cp_origin_log partition(date='$day_01')"
echo $HQL_ORIGIN
/usr/bin/hive -e "$HQL_ORIGIN"





#4导入cp_origin_log表原始数据到cp_project.cp_uuid_log
HQL_UUID="$HQL_ADD_JAR;$HQL_UDF;insert overwrite table $cp_uuid_log partition(date='$day_01') select container_id,container_name,source,log from $cp_origin_log where instr(log,'uuid') > 0 and date = '$day_01'"
echo $HQL_UUID
/usr/bin/hive -e "$HQL_UUID"



#5导入cp_uuid_log表原始数据到cp_project.t_cp_session
HQL_INSERT_SESSION="$HQL_ADD_JAR;$HQL_UDF;insert overWrite table $t_cp_session partition(date='$day_01') select logToField(log,'type') as type,logToField(log,'uuid') as uuid,logToField(log,'dateTime') as dateTime,logToField(log,'sid') as sid, logToField(log,'uid') as uid,logToField(log,'aid') as aid,logToField(log,'lid') as lid,logToField(log,'lty') as lty,logToField(log,'did') as did,logToField(log,'dty') as dty from $cp_uuid_log  where logToField(log,'type')='session' and date='$day_01'"
echo $HQL_INSERT_SESSION
/usr/bin/hive -e "$HQL_INSERT_SESSION"





#6导入cp_uuid_log表原始数据到cp_project.t_cp_platform
HQL_INSERT_PLATFORM="$HQL_ADD_JAR;$HQL_UDF;insert overwrite table $t_cp_platform partition(date='$day_01') select logToField(log,'type') as type,logToField(log,'uuid') as uuid,logToField(log,'dateTime') as dateTime,logToField(log,'deviceTypeSid') as deviceTypeSid,logToField(log,'deviceTypeCode') as deviceTypeCode,logToField(log,'deviceTypeName') as deviceTypeName,logToField(log,'platContentTypeSid') as platContentTypeSid,logToField(log,'platContentTypeCode') as platContentTypeCode,logToField(log,'platContentTypeName') as platContentTypeName,logToField(log,'platContentDetailApiSid') as platContentDetailApiSid,logToField(log,'detailApiCode') as detailApiCode,logToField(log,'detailApiName') as detailApiName,logToField(log,'isSuccess') as isSuccess from $cp_uuid_log  where logToField(log,'type')='platform' and date='$day_01'"
echo $HQL_INSERT_PLATFORM
/usr/bin/hive -e "$HQL_INSERT_PLATFORM"




#7导入cp_uuid_log表原始数据到cp_project.t_cp_provider
HQL_INSERT_PROVIDER="$HQL_ADD_JAR;$HQL_UDF;insert overwrite  table $t_cp_provider partition(date='$day_01') select logToField(log,'type') as type,logToField(log,'uuid') as uuid,logToField(log,'dateTime') as dateTime,logToField(log,'providerSid') as providerSid,logToField(log,'providerCode') as providerCode,logToField(log,'providerName') as providerName,logToField(log,'providerContentApiAdapterSid') as providerContentApiAdapterSid,logToField(log,'providerContentApiAdapterCode') as providerContentApiAdapterCode,logToField(log,'providerContentApiAdapterName') as providerContentApiAdapterName,logToField(log,'cpApiPath') as cpApiPath,logToField(log,'isSuccess') as isSuccess from $cp_uuid_log  where logToField(log,'type')='provider' and date='$day_01'"
echo $HQL_INSERT_PROVIDER
/usr/bin/hive -e "$HQL_INSERT_PROVIDER"





