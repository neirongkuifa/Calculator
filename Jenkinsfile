#!/usr/bin/env groovy
pipeline{
    agent any

    stages{
        stage('Git'){
            steps{
                sh "rm -r Calculator"
                sh "git clone 'https://github.com/neirongkuifa/Calculator.git'"
            }
        }

        stage('Build'){
            steps{
                sh "/usr/local/bin/mvn package"
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }

    }
}