#!/bin/bash


Java -Xms512M -Xmx512M -Xss1024K -XX:PermSize=256m -XX:MaxPermSize=512m -cp KafkaOffsetMonitor-assembly-0.2.0.jar \
com.quantifind.kafka.offsetapp.OffsetGetterWeb \
--zk 10.1.16.34:2181,10.1.16.35:2182,10.1.16.36:2181 \               
--port 8086 \
--refresh 10.seconds \
--retain 7.days
