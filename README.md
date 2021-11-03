# didactic-clinic
Sample (and simple) CRUD application using Spring Boot with REST APIs + Hibernate

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them


* [MySql](https://dev.mysql.com/downloads/installer/)
* An IDE of your choice (e.g. [eclipse](https://www.eclipse.org/downloads/), [intellij](https://www.jetbrains.com/idea/download/), [spring tools suite](https://spring.io/tools3/sts/all))
* [JDK 11](https://www.oracle.com/java/technologies/downloads/#java11-windows) or higher
* [Maven](https://maven.apache.org/install.html)
* [Git](https://git-scm.com/download/win) 
* An API testing tool such as [Postman](https://www.getpostman.com/downloads/), [JMeter](https://jmeter.apache.org/download_jmeter.cgi), [SoapUI](https://www.soapui.org/downloads/latest-release.html)


### Setting things up (DEV)

Clone the repository to your local machine:
```
git clone https://github.com/PauloPenteado/didactic-clinic.git
```

Install MySql. If you ask me, I would tell you to go for the installer including the workbench 

Once MySql is up and running, create the sample clinic database:
```
CREATE DATABASE IF NOT EXISTS clinic;
```

Build the project with Maven:
```
mvn clean compile package
```

...and you're all set, there is no need to worry about DB objects. Flyway will take care of it. 

Run the project:
```
java -jar target/{newJarFileName}.jar
```


**Don't forget to update the application.properties with your DB credentials** 

## Running the tests

Check the results using an API testing tool:

http://localhost:8080/api/patients/

