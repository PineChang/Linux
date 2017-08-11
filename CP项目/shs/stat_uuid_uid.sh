#!/bin/bash

#=================================================================
#统计uuid和uid情况
#=================================================================

day_01=`date -d"$1 day" +%Y%m%d`

syear=`date --date=$day_01 +%Y`
smonth=`date --date=$day_01 +%m`
sday=`date --date=$day_01 +%d`

t_cp_session="cp_project.t_cp_session"
t_cp_platform="cp_project.t_cp_platform"
t_cp_provider="cp_project.t_cp_provider"
i_cp_uuid_total="cp_project.i_cp_uuid_total"
i_cp_uid_total="cp_project.i_cp_uid_total"

HQL_UUID="insert overwrite table $i_cp_uuid_total partition(date='$day_01') select p.platContentTypeSid,p.platContentTypeCode,p.platContentTypeName,count(distinct(p.uuid)),count(distinct(s.uuid)),count(distinct(s.uid)) from $t_cp_platform p left outer join $t_cp_session s on (p.uuid=s.uuid and p.date='$day_01' and s.date='$day_01') group by p.platContentTypeSid,p.platContentTypeCode,p.platContentTypeName"

echo $HQL_UUID

/usr/bin/hive -e "$HQL_UUID"



HQL_UID="insert overwrite table $i_cp_uid_total partition(date='$day_01') select p.platContentTypeSid,p.platContentTypeCode,p.platContentTypeName,s.uid,count(distinct(p.uuid)),count(distinct(s.uuid)) from $t_cp_platform p left outer join $t_cp_session s on (p.uuid=s.uuid and p.date='$day_01' and s.date='$day_01') group by p.platContentTypeSid,p.platContentTypeCode,p.platContentTypeName,s.uid"


echo $HQL_UID

/usr/bin/hive -e "$HQL_UID"








