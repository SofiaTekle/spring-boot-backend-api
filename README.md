# Spring Boot Backend API

A backend application built with Java and Spring Boot.

The project demonstrates how to build a RESTful API using a clean layered architecture, DTOs, validation, and a real
PostgreSQL database.

---

## Features

- RESTful API with Spring Boot
- Layered architecture (Controller, Service, Repository)
- DTOs for requests and responses
- Input validation and global exception handling
- PostgreSQL database hosted on Neon
- Entity relationship between Users and Products
- Safe delete logic (users cannot be deleted if products exist)

---

## Technologies Used

- Java 21
- Spring Boot 3.x
- Spring Data JPA / Hibernate
- PostgreSQL (Neon)
- Maven
- Lombok

## Project Structure

```
se.iths.sofia.springbootproj
├── controller
├── dto
├── model
├── repo
├── service
├── exception
└── resources

```
