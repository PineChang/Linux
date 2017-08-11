#!/bin/bash

#=================================================================
#统计uuid和uid情况
#=================================================================

day_01=`date -d"$1 day" +%Y%m%d`

rsyear=`date --date=$day_01 +%Y`
smonth=`date --date=$day_01 +%m`
sday=`date --date=$day_01 +%d`

t_cp_session="cp_project.t_cp_session"
t_cp_platform="cp_project.t_cp_platform"
t_cp_provider="cp_project.t_cp_provider"
i_cp_req_total="cp_project.i_cp_req_total"
i_cp_hour_rate="cp_project.i_cp_hour_rate"
i_cp_req_cnt="cp_project.i_cp_req_cnt"
t_cp_all="cp_project.t_cp_all"


HQL_CP_REQ_CNT="insert overwrite table $i_cp_req_cnt partition(date='$day_01') select platContentTypeSid,platContentTypeCode,platContentTypeName,providerSid,providerCode,providerName,count(distinct(platformuuid)) as cp_total,concat('$rsyear','-','$smonth','-','$sday') as cp_date from $t_cp_all
where date='$day_01' group by platContentTypeSid,platContentTypeCode,platContentTypeName,providerSid,providerCode,providerName"
echo $HQL_CP_REQ_CNT

/usr/bin/hive -e "$HQL_CP_REQ_CNT"


HQL_CP_HOUR_RATE="insert overwrite table $i_cp_hour_rate partition(date='$day_01')
select platContentTypeSid,platContentTypeCode,platContentTypeName,hr,succ,round(succ/total,6),fail,round(fail/total,6),total,concat('$rsyear','-','$smonth','-','$sday') as cp_date
from(
select  platContentTypeSid,platContentTypeCode,platContentTypeName,concat(year,'-',month,'-',day,'-',hour) as hr,
sum(case cast(issuccess as int) when 0 then 1 else 0 end) as succ,
sum(case cast(issuccess as int) when 1 then 1 else 0 end) as fail,
count(*) as total from (
select platContentTypeSid,platContentTypeCode,platContentTypeName,dateTime,
substr(dateTime,1,4) as year,
substr(dateTime,6,2) as month,
substr(dateTime,9,2) as day,
substr(dateTime,12,2) as hour,
substr(dateTime,15,2) as minute,
substr(dateTime,18,2) as secound,
issuccess
from $t_cp_platform where dateTime is not null and date='$day_01' and instr(dateTime,concat('$rsyear','-','$smonth','-','$sday'))>0) tmp group by platContentTypeSid,platContentTypeCode,platContentTypeName,concat(year,'-',month,'-',day,'-',hour)
) tmp"

echo $HQL_CP_HOUR_RATE

/usr/bin/hive -e "$HQL_CP_HOUR_RATE"








