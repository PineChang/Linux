#!/bin/bash

#===============================================================================
#��hadoop�е��ļ��ƶ���hive��
#===============================================================================

#flume�ɼ������ݴ�ŵ�Ŀ¼
log_flume_dir=/docker_messages/cplog
#flumeԤ����Ĵ��Ŀ¼��
log_pre_input=/docker_messages/cplog_pre

#��ȡʱ����Ϣ
#�õ������Ǽ��꼸�¼���
day_01=`date -d"$1 day" +%Y%m%d`
#�ֱ��õ����յ���������Ϣ
syear=`date --date=$day_01 +%Y`
smonth=`date --date=$day_01 +%m`
sday=`date --date=$day_01 +%d`

#��ȡ��־�ļ���Ŀ¼
files=`hadoop fs -ls $log_flume_dir | grep $day_01 | wc -l`
echo $files
#�������һ����ļ���files�������0
if [ $files -gt 0 ];then
#�������ⲿ���������һ�������

HQL_PRE="alter table cp_project.cp_origin_external drop if exists partition (date='$day_01');alter table cp_project.cp_origin_external add partition

(date='$day_01') location '/docker_messages/cplog/$day_01'"
echo HQL_PRE
/usr/bin/hive -e "$HQL_PRE"


#����ӵĵ��������к���ms:cp���ַ������й��˵�cplog_pre�ļ�������
HQL_CP="insert overwrite directory '/docker_messages/cplog_pre/$day_01' select line from cp_project.cp_origin_external where date='$day_01' and instr(line,'ms:cp')>0"
echo $HQL_CP
/usr/bin/hive -e "$HQL_CP"
echo "success process ${log_flume_dir}/${day_01} to ${log_pre_input}"
fi


#===============================================================================
#��hadoop��Ԥ����Ŀ¼�е���־���ص�hive��
#===============================================================================
#Ŀ��hive��

cp_origin_log="cp_project.cp_origin_log"
cp_uuid_log="cp_project.cp_uuid_log"

t_cp_session="cp_project.t_cp_session"
t_cp_platform="cp_project.t_cp_platform"
t_cp_provider="cp_project.t_cp_provider"

#1��������json��jar
json_ser_jar="/var/lib/hadoop-hdfs/udf/json-serde-1.3.7-jar-with-dependencies.jar"
#��������log�ֶε�udfjar��
cp_udf_jar="/var/lib/hadoop-hdfs/udf/cp-1.0-SNAPSHOT.jar"
#����õ���jar��
HQL_ADD_JAR="add jar $json_ser_jar;add jar $cp_udf_jar"





#2�Զ����udf����
UDF_CLASS="cn.com.pateo.cpETL.LogToField"
HQL_UDF="create temporary function logToField as '$UDF_CLASS'"
echo $HQL_UDF





#3����ԭʼ���ݵ�cp_project.cp_origin_log
HQL_ORIGIN="$HQL_ADD_JAR;load data inpath '$log_pre_input/$day_01' overwrite into table $cp_origin_log partition(date='$day_01')"
echo $HQL_ORIGIN
/usr/bin/hive -e "$HQL_ORIGIN"





#4����cp_origin_log��ԭʼ���ݵ�cp_project.cp_uuid_log
HQL_UUID="$HQL_ADD_JAR;$HQL_UDF;insert overwrite table $cp_uuid_log partition(date='$day_01') select container_id,container_name,source,log from $cp_origin_log where instr(log,'uuid') > 0 and date = '$day_01'"
echo $HQL_UUID
/usr/bin/hive -e "$HQL_UUID"



#5����cp_uuid_log��ԭʼ���ݵ�cp_project.t_cp_session
HQL_INSERT_SESSION="$HQL_ADD_JAR;$HQL_UDF;insert overWrite table $t_cp_session partition(date='$day_01') select logToField(log,'type') as type,logToField(log,'uuid') as uuid,logToField(log,'dateTime') as dateTime,logToField(log,'sid') as sid, logToField(log,'uid') as uid,logToField(log,'aid') as aid,logToField(log,'lid') as lid,logToField(log,'lty') as lty,logToField(log,'did') as did,logToField(log,'dty') as dty from $cp_uuid_log  where logToField(log,'type')='session' and date='$day_01'"
echo $HQL_INSERT_SESSION
/usr/bin/hive -e "$HQL_INSERT_SESSION"





#6����cp_uuid_log��ԭʼ���ݵ�cp_project.t_cp_platform
HQL_INSERT_PLATFORM="$HQL_ADD_JAR;$HQL_UDF;insert overwrite table $t_cp_platform partition(date='$day_01') select logToField(log,'type') as type,logToField(log,'uuid') as uuid,logToField(log,'dateTime') as dateTime,logToField(log,'deviceTypeSid') as deviceTypeSid,logToField(log,'deviceTypeCode') as deviceTypeCode,logToField(log,'deviceTypeName') as deviceTypeName,logToField(log,'platContentTypeSid') as platContentTypeSid,logToField(log,'platContentTypeCode') as platContentTypeCode,logToField(log,'platContentTypeName') as platContentTypeName,logToField(log,'platContentDetailApiSid') as platContentDetailApiSid,logToField(log,'detailApiCode') as detailApiCode,logToField(log,'detailApiName') as detailApiName,logToField(log,'isSuccess') as isSuccess from $cp_uuid_log  where logToField(log,'type')='platform' and date='$day_01'"
echo $HQL_INSERT_PLATFORM
/usr/bin/hive -e "$HQL_INSERT_PLATFORM"




#7����cp_uuid_log��ԭʼ���ݵ�cp_project.t_cp_provider
HQL_INSERT_PROVIDER="$HQL_ADD_JAR;$HQL_UDF;insert overwrite  table $t_cp_provider partition(date='$day_01') select logToField(log,'type') as type,logToField(log,'uuid') as uuid,logToField(log,'dateTime') as dateTime,logToField(log,'providerSid') as providerSid,logToField(log,'providerCode') as providerCode,logToField(log,'providerName') as providerName,logToField(log,'providerContentApiAdapterSid') as providerContentApiAdapterSid,logToField(log,'providerContentApiAdapterCode') as providerContentApiAdapterCode,logToField(log,'providerContentApiAdapterName') as providerContentApiAdapterName,logToField(log,'cpApiPath') as cpApiPath,logToField(log,'isSuccess') as isSuccess from $cp_uuid_log  where logToField(log,'type')='provider' and date='$day_01'"
echo $HQL_INSERT_PROVIDER
/usr/bin/hive -e "$HQL_INSERT_PROVIDER"





