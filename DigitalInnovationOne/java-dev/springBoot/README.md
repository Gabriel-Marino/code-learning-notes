to create a project, go to [Srping initializr](https://start.spring.io/)
to run the project
```bash script
mvn spring-boot:run
```
after running the project, [you can see the execution here](http://localhost:8080)

* Skinny   jar: only encapsulates the app
* Thin     jar: encapsulates the app and app dependencies
* Hollow   jar: only encapsulates the app runtime
* Fat/Uber jar: encapsulates Skinny, Thin and Hollow jar's

to build the projetc
```bash script
mvn clean install
```
to execute after building
```bash script
java -jar target/projectname.jar
```
after executing the project, [you can see the execution here](http://localhost:8080)

to execute via tomact, you need first go to pom.xml and change the packaging value from 'jar' to 'war' the run
```bash script
mvn clean install
mv target/projectname.wat ../apache-tomcat-version/webapps
bash apache/tomcat-version/bin/start.sh
```
after executing the project, [you can see the execution here](http://localhost:8080)
