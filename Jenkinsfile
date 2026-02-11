pipeline {
    agent any

    tools {
        // Ange JDK som motsvarar projektet, t.ex. JDK17 eller JDK21
        jdk 'JDK21'
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/SofiaTekle/spring-boot-backend-api.git'
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
