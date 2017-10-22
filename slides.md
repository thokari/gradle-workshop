# Gradle Workshop

---

# Agenda

- Motivation
- Evolution of build tools
- Language basics
- Gradle basic concepts
- Building Java projects with Gradle
- Gradle and IDEs

---

# Motivation behind Gradle

- flexible, extensible project automation
- understandable configuration language
- ease of development setup
- incremental build
- multi-project builds
- multi-language projects

---

# Motivation for this workshop

- Gradle used in several projects  
  (epagesj, ESF, BEYOND services)
- new colleagues
- improve project setup and sustainability
- previous experience

---

# Evolution of Build Tools

----

## Lowest level: compilers
- read in source directory
- write output directory
- specific language
- not necessarily present or called explicitly with scripting languages

----

## Build automation tools
# [GNU Make](https://www.gnu.org/software/make/)
- shell based
- language agnostic
- supports incremental compilation (!)

----

## Build automation tools
# [Apache Ant](http://ant.apache.org/)
- written in Java
- XML and library based

----

## Build automation tools
# [Apache Maven](https://maven.apache.org/)
- written in Java
- XML and library / plugin based

----

## Build automation tools
# [Gant](https://gant.github.io/)
- written in Groovy
- Ant with Groovy scripts instead of XML

----

## Build automation tools
# Gradle
- Groovy (and Kotlin) for scripting
- compatible with Ant
- using conventions popularised by Maven
- packaged plugins and script plugins
- increased flexibility
- ability to refactor

---

# Language basics

----

## Language basics
# Groovy
## examples / 01-groovy

----

## Language basics
# Gradle
## [Documentation](https://gradle.org/docs/)
- User Guide, API docs, DSL docs

---

# Gradle basic concepts

----

## Gradle basic concepts
- Project, Tasks
- Build Lifecycle
- Plugins

----

## Gradle basic concepts
# Tasks
## examples / 02-tasks
## examples / 03-task-ordering

----

## Gradle basic concepts
# Tasks
## sessions / 01-task-basics

----

## Gradle basic concepts
# Build Lifecycle
- Initialization phase
- Configuration phase
- Execution phase

----

## Gradle basic concepts
# Build Lifecycle
## examples / 05-build-lifecycle

----

## Gradle basic concepts
# Plugins
## examples / 06-script-plugins
## sessions / 03-plugins

---

# Building Java projects

----

## Building Java projects
# Documentation
## The [java](https://docs.gradle.org/current/userguide/java_plugin.html) plugin

----

## Building Java projects
# Example
## examples / 07-java-project

----

## Building Java projects
# Concepts
- Source Sets
- Configurations
- Dependencies

----

## Building Java projects
# Session
## sessions / 04-java-project

---

# Gradle and IDEs

----

## Gradle and IDEs
# The problem:
### IDEs compile code themselves...
### How to avoid IDE specific setup?

----

## Gradle and IDEs
# Documentation
## The [eclipse](https://docs.gradle.org/current/userguide/eclipse_plugin.html) plugin

----

## Gradle and IDEs
# Example: Formatter
## examples / 08-eclipse-formatter

---

# Questions ?

----

# Feedback
