pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Clones the repository
                git 'https://github.com/your-username/java-application.git'
            }
        }

        stage('Build') {
            steps {
                // Builds the Java application using Maven
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Runs tests using Maven
                sh 'mvn test'
            }
        }

        stage('Execute') {
            steps {
                // Executes the Java application (assuming the main class is in a JAR file)
                sh 'java -jar target/your-application.jar'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully.'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
