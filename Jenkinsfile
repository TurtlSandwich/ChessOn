pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Starting Build Step'
        echo 'Build Step Complete'
        sh 'mvn -B clean deploy sonar:sonar'
        waitForQualityGate true
      }
    }

    stage('Testing') {
      steps {
        sh 'mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dlicense.skip=true'
      }
    }

  }
  tools {
    maven 'maven'
  }
}