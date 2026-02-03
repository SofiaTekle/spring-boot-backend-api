# Spring Boot Backend API

A backend application built with **Java 21** and **Spring Boot**.

This project demonstrates how to build a modern, production‑ready **RESTful API** using a layered architecture,
DTOs, validation, containerization, and CI automation.

It reflects real-world backend development practices with a focus on clean architecture, automation, and
maintainability.


---

## ✨ Features

* RESTful API built with Spring Boot
* Clean layered architecture (Controller, Service, Repository)
* DTOs for requests and responses
* Input validation and global exception handling
* PostgreSQL database
* Entity relationship between **Users** and **Products**
* Safe delete logic (users cannot be deleted if products exist)

---

## 🛠️ Technologies Used

* Java 21
* Spring Boot 3.x
* Spring Data JPA / Hibernate
* PostgreSQL
* Maven
* Lombok
* Docker & Docker Compose
* GitHub Actions (CI)

---

## 📂 Project Structure

```
se.iths.sofia.springbootproj
├── controller   # REST controllers
├── dto          # Request / response DTOs
├── model        # JPA entities
├── repo         # Spring Data JPA repositories
├── service      # Business logic
├── exception    # Global exception handling
└── resources    # Configuration files
```

---

## 🚀 Running the Application

### Option 1: Run locally (without Docker)

Requirements:

* Java 21
* PostgreSQL

Configure your database connection in `application.properties`, then run:

```bash
mvn spring-boot:run
```

---

### Option 2: Run with Docker (recommended)

This project includes **Docker** and **Docker Compose** for a fully containerized setup.

Start the application and database with:

```bash
docker-compose up --build
```

The API will be available at:

```
http://localhost:8080
```

---

## 📌 Notes

* Docker uses an isolated PostgreSQL database (separate from local databases)
* A fresh database is created on startup when running with Docker

---

## 👤 Author

**Sofia Tekle**

This project is part of my backend development portfolio and demonstrates practical experience with modern Spring Boot
applications.

