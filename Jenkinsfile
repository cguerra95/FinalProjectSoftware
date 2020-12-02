pipeline {
  agent any
  stages {
    stage('Build stage') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }

  }
}