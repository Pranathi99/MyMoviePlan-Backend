pipeline {
    agent any
    stages {
        stage('git repo clone') {
            steps {
                git branch: 'main', url: 'https://github.com/Pranathi99/TestProject-Backend.git'
            }
        }
        stage('clean') {
            steps {
                sh "mvn clean"
            }
        }
        stage('package') {
            steps {
                sh "mvn package"
            }
        }
         stage('docker build') {
             steps {
                 sh "docker build -t my-movie-plan ."
             }
         }
         stage('docker run postgres') {
             steps {
                 sh "docker run --name db -e MYSQL_ROOT_PASSWORD=admin@root -e MYSQL_DATABASE=my_movie_plan -e MYSQL_USER=mysql -e MYSQL_PASSWORD=root -d mysql:latest"
                 //sh "docker run --name db -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=my_movie_plan -p 5432:5432 -d postgres"
            }
         }
        stage('docker run') {
             steps {
                 sh "docker run -p 5555:5555 --name my-movie-plan-backend --link db -d my-movie-plan:latest"
             }
        }
    }
}
