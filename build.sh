#! /bin/bash

echo "please visit application.properties and make sure in memory stuff are moved as external configs"

docker stop $(docker ps -aq)

docker rm $(docker ps -aq)



docker-compose -f mysql.yml up -d

docker-compose -f activemq.yml up -d



