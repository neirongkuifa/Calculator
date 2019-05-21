#!/usr/bin/env groovy
pipeline{
    agent any

    stages{
        stage('Git'){
            steps{
                git clone "https://github.com/neirongkuifa/Calculator.git"
            }
        }

        stage('Build'){
            steps{
                tool name: 'maven 3.6.1', type: 'maven' test
            }
        }

        stage('Test'){
            steps{
                tool name: 'maven 3.6.1', type: 'maven' test
            }
        }
    }
}