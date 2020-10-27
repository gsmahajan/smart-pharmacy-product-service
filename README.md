# smart-pharmacy-product-service

![Sonar Cloud](https://github.com/girishaiocdawacs/smart-pharmacy-product-service/workflows/Sonar%20Cloud/badge.svg?branch=master)

![Java CI with Maven](https://github.com/girishaiocdawacs/smart-pharmacy-product-service/workflows/.github/workflows/maven.yml/badge.svg)

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
D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service>native-image --version
GraalVM Version 20.2.0 (Java Version 11.0.8)




native-image -cp ./target/smart-pharmacy-product-service-0.0.1-SNAPSHOT.jar -H:Name=productservice -H:Class=com.aiocdawacs.smart.pharmacy.SmartPharmacyProductServiceApplication -H:+ReportUnsupportedElementsAtRuntime -H:+ReportExceptionStackTraces -H:-CheckToolchain --allow-incomplete-classpath




D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service>native-image -jar ./target/smart-pharmacy-product-service-0.0.1-SNAPSHOT.jar -H:Name=product
[product:14840]    classlist:   1,167.69 ms,  0.96 GB
[product:14840]        (cap):  11,862.76 ms,  0.96 GB
[product:14840]        setup:  13,585.72 ms,  0.96 GB
[product:14840]     (clinit):     135.88 ms,  1.70 GB
[product:14840]     analysis:  15,558.38 ms,  1.70 GB
Warning: Aborting stand-alone image build due to unsupported features
Warning: Use -H:+ReportExceptionStackTraces to print stacktrace of underlying exception
[product:13356]    classlist:   1,111.74 ms,  0.96 GB
[product:13356]        (cap):   5,895.76 ms,  0.96 GB
[product:13356]        setup:   7,576.69 ms,  0.96 GB
[product:13356]     (clinit):     152.29 ms,  1.21 GB
[product:13356]   (typeflow):   5,094.12 ms,  1.21 GB
[product:13356]    (objects):   3,885.09 ms,  1.21 GB
[product:13356]   (features):     198.72 ms,  1.21 GB
[product:13356]     analysis:   9,617.51 ms,  1.21 GB
[product:13356]     universe:     389.14 ms,  1.21 GB
[product:13356]      (parse):   1,862.39 ms,  1.21 GB
[product:13356]     (inline):   1,805.92 ms,  1.65 GB
[product:13356]    (compile):  10,201.16 ms,  2.25 GB
[product:13356]      compile:  14,416.90 ms,  2.25 GB
[product:13356]        image:   1,017.64 ms,  2.25 GB
[product:13356]        write:     409.59 ms,  2.25 GB
[product:13356]      [total]:  34,736.18 ms,  2.25 GB
Warning: Image 'product' is a fallback image that requires a JDK for execution (use --no-fallback to suppress fallback image generation and to print more detailed information why a fallback image was necessary).
```

```
D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service>product.exe

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.4.RELEASE)

2020-10-25 11:46:08.915  INFO 10320 --- [           main] s.SmartPharmacyProductServiceApplication : Starting SmartPharmacyProductServiceApplication v0.0.1-SNAPSHOT on DESKTOP-45UA338 with PID 10320 (D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service\target\smart-pharmacy-product-service-0.0.1-SNAPSHOT.jar started by giris in D:\aiocd-workspace\java-workspace\smart-pharmacy-product-service)
2020-10-25 11:46:08.919  INFO 10320 --- [           main] s.SmartPharmacyProductServiceApplication : No active profile set, falling back to default profiles: default
2020-10-25 11:46:09.885  INFO 10320 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFERRED mode.
2020-10-25 11:46:09.974  INFO 10320 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 78ms. Found 4 JPA repository interfaces.
2020-10-25 11:46:10.752  INFO 10320 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2020-10-25 11:46:10.765  INFO 10320 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-10-25 11:46:10.766  INFO 10320 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.38]
2020-10-25 11:46:10.841  INFO 10320 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-10-25 11:46:10.842  INFO 10320 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1841 ms
2020-10-25 11:46:10.984  INFO 10320 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-10-25 11:46:11.229  INFO 10320 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2020-10-25 11:46:11.498  INFO 10320 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:testdb'
2020-10-25 11:46:11.665  INFO 10320 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-10-25 11:46:11.718  INFO 10320 --- [         task-1] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2020-10-25 11:46:11.775  WARN 10320 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2020-10-25 11:46:11.822  INFO 10320 --- [         task-1] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.21.Final
2020-10-25 11:46:12.004  INFO 10320 --- [         task-1] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
2020-10-25 11:46:12.189  INFO 10320 --- [         task-1] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2020-10-25 11:46:12.885  INFO 10320 --- [         task-1] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2020-10-25 11:46:12.895  INFO 10320 --- [         task-1] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2020-10-25 11:46:12.952  INFO 10320 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
2020-10-25 11:46:13.005  INFO 10320 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2020-10-25 11:46:13.007  INFO 10320 --- [           main] DeferredRepositoryInitializationListener : Triggering deferred initialization of Spring Data repositoriesà
2020-10-25 11:46:13.252  INFO 10320 --- [           main] DeferredRepositoryInitializationListener : Spring Data repositories initialized!
2020-10-25 11:46:13.269  INFO 10320 --- [           main] s.SmartPharmacyProductServiceApplication : Started SmartPharmacyProductServiceApplication in 4.888 seconds (JVM running for 5.395)
```






```
C:\Users\giris>curl -X GET localhost:8080/product/order/3
{"id":3,"product":{"id":1000,"name":"SYNTHROID","price":"7457","distributorName":"Cormier-Wisozk","genericName":"levothyroxine sodium tablets","companyName":"Cardinal Health"},"distributor":{"id":23,"stockistName":"Effertz-Sauer","address":"73 School Plaza","email":"mtwinem@clickbank.net","productId":23,"availableQuantity":82},"pharmasist":{"id":2,"pharmasistName":"Ainsley","pharmasistAddress":"Stieger","email":"astieger1@fema.gov"},"creationDate":"2020-10-25T11:46:11","quantity":130,"orderStatus":true}
C:\Users\giris>
```