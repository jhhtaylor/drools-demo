# Drools Demo

This is a minimal example project using the [Drools](https://www.drools.org/) rules engine on [Quarkus](https://quarkus.io/). The project builds a simple Java application that loads a single DRL rule and executes it.

## Requirements

- Java 17 or later
- Maven

## Running

Use Maven to build and run the demo:

```bash
mvn quarkus:run
```

The application inserts the string `"World"` into the session, and the rule prints a greeting.
