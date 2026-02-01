# Spring Boot Backend API

A backend application built with **Java** and **Spring Boot** as part of my system development studies.

The project focuses on building **RESTful APIs**, handling requests and responses, and integrating with a database.  
It was developed to practice **backend architecture**, **clean code principles**, and basic **API design**.

---

## Features

- Demonstrates **layered architecture** (Controller, Service, Repository).  
- Integration with a database using **Spring Data JPA**.  
- Rendering HTML views with **Thymeleaf** (for demonstration purposes).  
- Basic CRUD functionality for managing entities (e.g., products, users).  
- Example of clean code and organized project structure.

---

## Technologies Used

- Java 17+  
- Spring Boot 3.x  
- Spring Data JPA / Hibernate  
- Thymeleaf  
- Maven  
- PostgreSQL or H2 database  
- Git & GitHub for version control
- Lombok for reducing boilerplate code


## Project Structure

se.iths.sofia.springbootproj
```
├── controller # Handles HTTP requests

├── model # Entity classes

├── repo # Repository interfaces for DB access

├── service # Business logic

├── resources

 └── templates # Thymeleaf templates

 └── static # CSS, JS, images
```
