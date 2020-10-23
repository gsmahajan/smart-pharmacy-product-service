# smart-pharmacy-product-service


mvn spring-boot:run to run the service


mvn package -Pgraal for native-image

otherwise

{code}
native-image -cp ./target/smart-pharmacy-product-service-0.0.1-SNAPSHOT.jar -H:Name=productservice -H:Class=com.aiocdawacs.smart.admin.smartpharmacyproductservice.SmartPharmacyProductServiceApplication -H:+ReportUnsupportedElementsAtRuntime --allow-incomplete-classpath
{code}