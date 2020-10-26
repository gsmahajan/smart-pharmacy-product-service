pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -U clean package'
            }
        }
        stage('Generate Native Image') {
            steps {
                sh 'mvn package -Pgraal'
            }
        }
        stage('Generate Native Image Manually') {
            steps {
                sh 'native-image -jar ./target/smart-pharmacy-product-service-0.0.1-SNAPSHOT.jar -H:Name=product'
            }
        }
    }
}