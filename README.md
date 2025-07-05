# Drools Demo

This is a minimal example project using the [Drools](https://www.drools.org/) rules engine on [Quarkus](https://quarkus.io/). The application demonstrates a few sample rules with intentionally varied formatting to aid in testing DRL tooling.

## Requirements

- Java 17 or later
- Maven

## Running

Use Maven to build and run the demo:

```bash
mvn quarkus:run
```

The application inserts the string `"World"` into the session, fires all rules, and prints the output for each.
