# smart-pharmacy-product-service

to run the service
```
mvn spring-boot:run 
```
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