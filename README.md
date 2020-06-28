1. open cmd
2. cd c:/project (go to your project root folder)

In order to start rabbitmq service, launch the docker-compose :

3. docker-compose up

In order to run the project:

4. mvn clean install
5. mvn spring-boot:run

To stop and remove all working containers:
- docker stop $(docker ps -a -q)
- docker rm $(docker ps -a -q)

To remove image:
- docker image rm -f "ImageID"

The application has been tested on H2 Database as well as locally on MySql. 


