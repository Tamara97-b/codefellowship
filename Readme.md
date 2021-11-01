## codefellowship
### Overview
This repository includes some basic implementation of Spring Authorization on a Java Web Application.

### Architecture
The programing language used to build this project is Java and using the Spring MVC Data and Thymeleaf.

### dependencies
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
implementation 'org.springframework.boot:spring-boot-starter-security'
implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
implementation 'org.springframework.boot:spring-boot-starter-web'
implementation 'org.thymeleaf.extras:thymeleaf-extras-springsecurity5'
developmentOnly 'org.springframework.boot:spring-boot-devtools'
runtimeOnly 'org.postgresql:postgresql'
testImplementation 'org.springframework.boot:spring-boot-starter-test'
testImplementation 'org.springframework.security:spring-security-test'

### End Points 
("/") => root.

("/signup") => signup page.

("/signin") => sginin page.

("/profile") => user's profile.
