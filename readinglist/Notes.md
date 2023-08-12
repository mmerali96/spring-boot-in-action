# Spring Boot

## Spring Boot Annotations
- @Configuration
- @ComponentScan - emables compoent scanning. classes and controllers automatically get discovered and registered as beans in the spring context
- @EnableAutoConfiguration - enables spring auto configuration
- @SpringBootApplication - does all three of these
- @SpringApplicationConfiguration loads a Spring application context for tests

## Dependencies
- See Maven dependency tree `$ mvn dependency:tree`

### Exclude dependencies with maven
```
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
  <exclusions>
    <exclusion>
      <groupId>com.fasterxml.jackson.core</groupId>
    </exclusion>
  </exclusions>
</dependency>
```
### Specify dependency version explicitly
```
<dependency>
  <groupId>com.fasterxml.jackson.core</groupId>
  <artifactId>jackson-databind</artifactId>
  <version>2.4.3</version>
</dependency>
```
