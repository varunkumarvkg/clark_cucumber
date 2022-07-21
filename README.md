# Automated test of Clark recommendation funnel in Java with Cucumber and Selenium WebDriver #

This project is of UI automated functional test for Clark recommendation funnel using Selenium and Cucumber.

Test scenarios are described in the feature files located here ./src/test/resources/features.


## Installation ##

You need to have [Java 8 JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) installed along with [maven](https://maven.apache.org/download.cgi).

To install all dependencies, run 

```console
$ mvn clean install
```

## Running tests ##

```console
$ mvn test
```
Tests can be run using the clarkTest.java in runner package, tags are used to identify the scenarios to be covered.



By default, tests will run on Chrome. To change that, specify `-Dbrowser={browser}` where `{browser}` is either `chrome` or `firefox`.

Property file is mentioned to set browser with property name "browser".

You can also select specific scenarios to execute using `-Dcucumber.options="--tags @your_tag"`.

settings.xml is placed in the root of the folder for maven.

The project follows page object model. The happy path is being covered, due to some blocker issue after registration page in application,
I was unable to cover schedule, recommendation card questionnaire scenarios in automation.



