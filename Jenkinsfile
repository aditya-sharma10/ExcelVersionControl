pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat '.\\mvnw.cmd clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t datasync-app .'
            }
        }

        stage('Deploy') {
            steps {
                bat 'docker compose up -d --build'
            }
        }
    }

    post {
        success {
            echo 'CI/CD Pipeline Executed Successfully'
        }

        failure {
            echo 'Build Failed'
        }
    }
}