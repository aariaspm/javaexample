pipeline {
  agent any
  options {
    ansicolor('xterm')
  }
  tools{
    maven 'maven-3.5.4'
    jdk 'jdk-1.8'
  }
  stages {
    stage ('Clean'){
      steps{
        sh 'mvn clean'
      }
    }
    stage ('Compile'){
      steps{
        sh 'mvn compile'
      }
    }
    stage ('Unit Tests'){
      steps{
        sh 'mvn test'
      }
      post {
        success {
          junit 'target/surefire-reports/**/*.xml'
        }
      }
    }
    stage ('Package'){
      steps{
        sh 'mvn package'
      }
    }
  }
}
