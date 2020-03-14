# Getting Started
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=axlsmit_springboot-demo&metric=alert_status)](https://sonarcloud.io/dashboard?id=axlsmit_springboot-demo)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=axlsmit_springboot-demo&metric=coverage)](https://sonarcloud.io/dashboard?id=axlsmit_springboot-demo)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=axlsmit_springboot-demo&metric=bugs)](https://sonarcloud.io/dashboard?id=axlsmit_springboot-demo)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=axlsmit_springboot-demo&metric=duplicated_lines_density)](https://sonarcloud.io/dashboard?id=axlsmit_springboot-demo)
### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/gradle-plugin/reference/html/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#production-ready)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### How to Run
These commands should be executed in a terminal or shell.
#### Linux or MacOS
`./gradlew clean bootRun`
#### Windows
`gradlew.bat clean bootRun`
### How to static code analysis
#### Linux or MacOS
`./gradlew clean jacocoTestReport sonarqube`
#### Windows
`gradlew.bat clean jacocoTestReport sonarqube`
### How to run JUnit test.
#### Linux or MacOS
`./gradlew clean jacocoTestReport`
#### Windows
`gradlew.bat clean jacocoTestReport`