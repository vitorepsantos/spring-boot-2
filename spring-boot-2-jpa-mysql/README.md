## Docker
```terminal
$ docker run --name mysql-server -e MYSQL_ROOT_PASSWORD=root -d mysql:latest (only first time)
or
$ docker start mysql-server 
$ docker ps
$ docker inspect mysql-server
```

## Liquibase
```terminal
$ cd liquibase
$ mvn clean install
$ mvn liquibase:update
or
$ mvn liquibase:update -Ptest (for test profile)
```