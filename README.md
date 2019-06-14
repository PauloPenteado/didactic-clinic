# didactic-clinic
Sample (and simple) CRUD application using Spring Boot with REST APIs + Hibernate

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them


* [MySql](https://dev.mysql.com/downloads/installer/)
* An IDE of your choice (e.g. [eclipse](https://www.eclipse.org/downloads/), [intellij](https://www.jetbrains.com/idea/download/), [spring tools suite](https://spring.io/tools3/sts/all))
* [JDK 1.8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or higher
* [Maven](https://maven.apache.org/install.html)
* [Git](https://git-scm.com/download/win) 
* An API testing tool such as [Postman](https://www.getpostman.com/downloads/), [JMeter](https://jmeter.apache.org/download_jmeter.cgi), [SoapUI](https://www.soapui.org/downloads/latest-release.html)


### Setting things up

Clone the repository to your local machine:
```
git clone https://github.com/PauloPenteado/didactic-clinic.git
```

Install MySql. If you ask me, I would tell you to go for the installer including the workbench 

Once MySql is up and running, create the sample clinic database:
```
CREATE DATABASE IF NOT EXISTS clinic;
```

...and you're all set, there is no need to worry about DB objects. Flyway will take care of it. 

**Don't forget to update the application.properties with your DB credentials** 

## Running the tests

Run the Spring Boot project and check the results using an API testing tool:
http://localhost:8080/api/patients/
