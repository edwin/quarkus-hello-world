# A Simple Hello-World CRUD Rest API with Quarkus 


 ## Tools
 - Java 11
 - Quarkus 2.0.0.Final
 
## How to run
 ```
$ mvn compile quarkus:dev
 ```

## How to build
 ```
$ mvn clean package
 ```

## How to run binary build
 ```
$ java -jar target\quarkus-app\quarkus-run.jar
 ```
 
 ## Get all data
```
$ curl -L -X GET 'http://localhost:8080/transfer/'
```
 
 ## Create new data
 ```
$ curl -L -X POST 'http://localhost:8080/transfer/' \
-H 'Content-Type: application/json' \
--data-raw '{
    "accountFrom":"4444",
    "accountTo": "55555",
    "amount" : 50000
}'
```

## Troubleshooting
Sometimes we run binary build directly and got below error,
```
no main manifest attribute, in target\hello-world-quarkus-1.0-SNAPSHOT.jar
``` 

above error happens because we are executing the wrong jar file within `target` folder, the right one (despite not an uberjar file) is actually on folder `target\quarkus-app` 

## Docker build
Run below command to do a docker build 
```
$ docker build -t hello-world-quarkus .
```

And run it by using below command
```
$ docker run hello-world-quarkus
```

Make sure to set the database connection on `application.properties` correctly first.