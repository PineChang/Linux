#!/bin/bash

#=================================================================
#统计uuid和uid情况
#=================================================================

day_01=`date -d"$1 day" +%Y%m%d`

rsyear=`date --date=$day_01 +%Y`
smonth=`date --date=$day_01 +%m`
sday=`date --date=$day_01 +%d`


/usr/bin/sqoop export --connect jdbc:mysql://10.1.16.60:3306/CPlog  --username obd_message --password obd_message --table i_cp_req_total --hcatalog-database cp_project --hcatalog-table i_cp_req_total --hcatalog-partition-keys date --hcatalog-partition-values $day_01


/usr/bin/sqoop export --connect jdbc:mysql://10.1.16.60:3306/CPlog  --username obd_message --password obd_message --table i_cp_hour_rate --hcatalog-database cp_project --hcatalog-table i_cp_hour_rate --hcatalog-partition-keys date --hcatalog-partition-values $day_01










