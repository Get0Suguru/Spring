# Spring Examples – XML, Annotations, and Java Config

This repo is a small collection of Spring Core examples showing three ways to wire beans:
- XML configuration
- Annotation-based configuration
- Pure Java configuration (@Configuration/@Bean)

There are two iterations:
- SPRING/ → v1 examples (core concepts)
- SPRING 2/ → v2 examples (refined, some tests)

## What’s inside

- SPRING/
    - by_xml/ → XML context + beans + a simple runner
    - by_annotations/ → @Component, @Autowired, @Qualifier + runner
    - by_JavaConfig/ → @Configuration, @Bean, AnnotationConfigApplicationContext

- SPRING 2/
    - spring_xml/
    - spring_annotations/
    - spring_javaConfig/
    - Similar ideas as v1, but a bit cleaner and with basic tests in some modules.

## Requirements

- JDK 8+ (JDK 17 recommended)
- Maven or Gradle (depending on how you open/run it in your IDE)
- Any IDE (IntelliJ IDEA recommended)

## How to run (quick)

Pick a module, open it in your IDE, and run the main class:
- XML: look for [mySpringApp.java](cci:7://file:///C:/Users/gauta/Desktop/spring/just_Spring/SPRING/by_xml/src/main/java/org/example/mySpringApp.java:0:0-0:0) or `App` under `src/main/java`
- Annotations: run `App`/[mySpringApp.java](cci:7://file:///C:/Users/gauta/Desktop/spring/just_Spring/SPRING/by_xml/src/main/java/org/example/mySpringApp.java:0:0-0:0) that bootstraps `ApplicationContext`
- Java Config: run the main class that uses `AnnotationConfigApplicationContext` and a `Config` class

Resources (like [config.xml](cci:7://file:///C:/Users/gauta/Desktop/spring/just_Spring/SPRING/by_xml/src/main/resources/config.xml:0:0-0:0), [car.properties](cci:7://file:///C:/Users/gauta/Desktop/spring/just_Spring/SPRING/by_xml/src/main/resources/car.properties:0:0-0:0)) live in `src/main/resources`.

## Project map

- SPRING/
    - by_xml/
        - src/main/java/org/example/ → `Engine`, `Vehicle`, `Car`, `Bus`, `mySpringApp`
        - src/main/resources/ → [config.xml](cci:7://file:///C:/Users/gauta/Desktop/spring/just_Spring/SPRING/by_xml/src/main/resources/config.xml:0:0-0:0), [car.properties](cci:7://file:///C:/Users/gauta/Desktop/spring/just_Spring/SPRING/by_xml/src/main/resources/car.properties:0:0-0:0)
    - by_annotations/
        - src/main/java/org/engineering/ → `Engine`, `Vehicle`, `Car`, engines (`BMWs70`, `ColomboV12`, `Ferrarif140`), `mySpringApp`
        - src/main/resources/ → [config.xml](cci:7://file:///C:/Users/gauta/Desktop/spring/just_Spring/SPRING/by_xml/src/main/resources/config.xml:0:0-0:0), [car.properties](cci:7://file:///C:/Users/gauta/Desktop/spring/just_Spring/SPRING/by_xml/src/main/resources/car.properties:0:0-0:0)
    - by_JavaConfig/
        - src/main/java/org/engineeringDigest/javaConfig/ → `Engine`, `Vehicle`, `V12`, `Car`, `Config`, `mySpringApp`
        - src/main/resources/ → [car.properties](cci:7://file:///C:/Users/gauta/Desktop/spring/just_Spring/SPRING/by_xml/src/main/resources/car.properties:0:0-0:0)

- SPRING 2/
    - spring_xml/
    - spring_annotations/
    - spring_javaConfig/
    - (Structure mirrors v1 with slight improvements and tests under `src/test/java`)

## Why two versions?

- v1 (SPRING/) shows the basics, concept by concept.
- v2 (SPRING 2/) revisits the same ideas with small cleanups and simple tests. It’s helpful to compare approaches or revisit later with better practices.

## Typical commands

If you’re using Maven inside a module folder:
```bash
mvn clean package
mvn exec:java