#!/usr/bin/env groovy
pipeline{
    agent any

    stages{
        stage('Git'){
            steps{
                sh "/usr/local/bin/mvn clean"
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

        // stage(''){
        //     steps{
        //         sh "/usr/local/bin/mvn deploy"
        //     }
        // }

    }
}