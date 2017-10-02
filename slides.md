# Gradle Workshop

---

# Agenda

- Motivation
- Evolution of build tools
- Groovy basics
- Build lifecycle
- Gradle domain model
- Building Java projects with Gradle

---

# Motivation

- flexible, extensible project automation
- understandable configuration language
- ease of development setup
- incremental build
- multi-project builds
- multi-language projects

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

# Basic Gradle concepts

----

## Basic Gradle concepts
# Tasks
## examples / 02-tasks
## examples / 03-task-ordering

----

## Basic Gradle concepts
# Tasks
## sessions / 01-task-basics

----

## Basic Gradle concepts
# Build Lifecycle

- Initialization phase
- Configuration phase
- Execution phase

----

# Build Lifecycle
## examples / 05-build-lifecycle
