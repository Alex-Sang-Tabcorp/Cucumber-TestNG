 pipeline {
  agent {
      label 'Test_Agent_VM_246'
  }
    stages {
        stage('Build') {            
            steps {                
                echo 'Building'            
            }        
        }        
        stage('Test') {            
            steps {                
                echo 'Testing'            
            }        
        }
        
    }

    post {        
        always {            
            echo 'One way or another, I have finished'            
            deleteDir() /* clean up our workspace */        
        }        
        success {            
            echo 'I succeeeded!'        
        }        
        unstable {            
            echo 'I am unstable :/'        
        }        
        failure {            
            echo 'I failed :('        
        }        
        changed {            
            echo 'Things were different before...'        
        }    
    }
}
