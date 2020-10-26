#! /bin/bash


docker-compose -f jenkins.yml up -d
 
docker-compose -f mysql.yml up -d

docker-compose -f activemq.yml up -d
