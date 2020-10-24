# smart-pharmacy-product-service

### run mysql
```
giris@DESKTOP-45UA338 MINGW64 /d/aiocd-workspace/java-workspace/smart-pharmacy-product-service (master)
$ docker-compose -f mysql.yml up
Some services (db) use the 'deploy' key, which will be ignored. Compose does not support 'deploy' configuration - use `docker stack deploy` to deploy to a swarm.
Creating smart-pharmacy-product-service_db_1 ... done
Attaching to smart-pharmacy-product-service_db_1
db_1  | 2020-10-24 15:20:00+00:00 [Note] [Entrypoint]: Entrypoint script for MySQL Server 8.0.22-1debian10 started.
db_1  | 2020-10-24 15:20:00+00:00 [Note] [Entrypoint]: Switching to dedicated user 'mysql'
db_1  | 2020-10-24 15:20:00+00:00 [Note] [Entrypoint]: Entrypoint script for MySQL Server 8.0.22-1debian10 started.
db_1  | 2020-10-24 15:20:00+00:00 [Note] [Entrypoint]: Initializing database files
db_1  | 2020-10-24T15:20:00.402158Z 0 [System] [MY-013169] [Server] /usr/sbin/mysqld (mysqld 8.0.22) initializing of server in progress as process 42
db_1  | 2020-10-24T15:20:00.411778Z 1 [System] [MY-013576] [InnoDB] InnoDB initialization has started.
db_1  | 2020-10-24T15:20:01.261661Z 1 [System] [MY-013577] [InnoDB] InnoDB initialization has ended.
db_1  | 2020-10-24T15:20:03.970373Z 6 [Warning] [MY-010453] [Server] root@localhost is created with an empty password ! Please consider switching off the --initialize-insecure option.
db_1  | 2020-10-24 15:20:08+00:00 [Note] [Entrypoint]: Database files initialized
db_1  | 2020-10-24 15:20:08+00:00 [Note] [Entrypoint]: Starting temporary server
db_1  | 2020-10-24T15:20:09.010463Z 0 [System] [MY-010116] [Server] /usr/sbin/mysqld (mysqld 8.0.22) starting as process 87
db_1  | 2020-10-24T15:20:09.064130Z 1 [System] [MY-013576] [InnoDB] InnoDB initialization has started.
db_1  | 2020-10-24T15:20:09.567407Z 1 [System] [MY-013577] [InnoDB] InnoDB initialization has ended.
db_1  | 2020-10-24T15:20:09.883586Z 0 [System] [MY-011323] [Server] X Plugin ready for connections. Socket: /var/run/mysqld/mysqlx.sock
db_1  | 2020-10-24T15:20:10.128979Z 0 [Warning] [MY-010068] [Server] CA certificate ca.pem is self signed.
db_1  | 2020-10-24T15:20:10.130058Z 0 [System] [MY-013602] [Server] Channel mysql_main configured to support TLS. Encrypted connections are now supported for this channel.
db_1  | 2020-10-24T15:20:10.134102Z 0 [Warning] [MY-011810] [Server] Insecure configuration for --pid-file: Location '/var/run/mysqld' in the path is accessible to all OS users. Consider choosing a different directory.
db_1  | 2020-10-24T15:20:10.194143Z 0 [System] [MY-010931] [Server] /usr/sbin/mysqld: ready for connections. Version: '8.0.22'  socket: '/var/run/mysqld/mysqld.sock'  port: 0  MySQL Community Server - GPL.
db_1  | 2020-10-24 15:20:10+00:00 [Note] [Entrypoint]: Temporary server started.
db_1  | Warning: Unable to load '/usr/share/zoneinfo/iso3166.tab' as time zone. Skipping it.
db_1  | Warning: Unable to load '/usr/share/zoneinfo/leap-seconds.list' as time zone. Skipping it.
db_1  | Warning: Unable to load '/usr/share/zoneinfo/zone.tab' as time zone. Skipping it.
db_1  | Warning: Unable to load '/usr/share/zoneinfo/zone1970.tab' as time zone. Skipping it.
db_1  | 2020-10-24 15:20:20+00:00 [Note] [Entrypoint]: Creating database AWACS_SMART_PHARMACY
db_1  |
db_1  | 2020-10-24 15:20:20+00:00 [Note] [Entrypoint]: Stopping temporary server
c
db_1  | 2020-10-24T15:20:20.381383Z 11 [System] [MY-013172] [Server] Received SHUTDOWN from user root. Shutting down mysqld (Version: 8.0.22).
db_1  | 2020-10-24T15:20:21.587515Z 0 [System] [MY-010910] [Server] /usr/sbin/mysqld: Shutdown complete (mysqld 8.0.22)  MySQL Community Server - GPL.
db_1  | 2020-10-24 15:20:22+00:00 [Note] [Entrypoint]: Temporary server stopped
db_1  |
db_1  | 2020-10-24 15:20:22+00:00 [Note] [Entrypoint]: MySQL init process done. Ready for start up.
db_1  |
db_1  | 2020-10-24T15:20:22.785140Z 0 [System] [MY-010116] [Server] /usr/sbin/mysqld (mysqld 8.0.22) starting as process 1
db_1  | 2020-10-24T15:20:22.820560Z 1 [System] [MY-013576] [InnoDB] InnoDB initialization has started.
db_1  | 2020-10-24T15:20:23.260266Z 1 [System] [MY-013577] [InnoDB] InnoDB initialization has ended.
db_1  | 2020-10-24T15:20:23.615722Z 0 [System] [MY-011323] [Server] X Plugin ready for connections. Bind-address: '::' port: 33060, socket: /var/run/mysqld/mysqlx.sock
db_1  | 2020-10-24T15:20:23.809006Z 0 [Warning] [MY-010068] [Server] CA certificate ca.pem is self signed.
db_1  | 2020-10-24T15:20:23.809947Z 0 [System] [MY-013602] [Server] Channel mysql_main configured to support TLS. Encrypted connections are now supported for this channel.
db_1  | 2020-10-24T15:20:23.818064Z 0 [Warning] [MY-011810] [Server] Insecure configuration for --pid-file: Location '/var/run/mysqld' in the path is accessible to all OS users. Consider choosing a different directory.

```

###to run the service
```
mvn spring-boot:run 
```


to run the service with native image creation

```
mvn package -Pgraal for native-image
```
otherwise

```bash

D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service>gu list
ComponentId              Version             Component name      Origin
--------------------------------------------------------------------------------
js                       20.2.0              Graal.js
graalvm                  20.2.0              GraalVM Core
native-image             20.2.0              Native Image        github.com

D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service>
D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service>
D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service>gu install native-image
Downloading: Component catalog from www.graalvm.org
Processing Component: Native Image
Component Native Image (org.graalvm.native-image) is already installed.

D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service>
D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service>
D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service>
D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service>native-image --version
GraalVM Version 20.2.0 (Java Version 11.0.8)




native-image -cp ./target/smart-pharmacy-product-service-0.0.1-SNAPSHOT.jar -H:Name=productservice -H:Class=com.aiocdawacs.smart.admin.smartpharmacyproductservice.SmartPharmacyProductServiceApplication -H:+ReportUnsupportedElementsAtRuntime -H:+ReportExceptionStackTraces -H:-CheckToolchain --allow-incomplete-classpath

```