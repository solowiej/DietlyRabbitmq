
In oder to run the project :

1. open cmd
2. cd c:/project (go to your project root folder)
3. docker-compose up
4. mvn clean install
5. mvn spring-boot:run

To stop and remove all working containers
docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)

