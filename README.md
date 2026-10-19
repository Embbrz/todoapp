# Full-Stack Spring Boot To-Do Application

A responsive, full-stack web application for managing daily tasks, built with Java, Spring Boot, Spring Data JPA, PostgreSQL, and Thymeleaf.

## Features
- **Task Creation & Persistence:** Add new tasks saved directly to a PostgreSQL database.
- **Task Management:** Toggle completion status with dynamic strike-through styling and delete unwanted tasks.
- **Responsive UI:** Clean user interface styled with Bootstrap 5.
- **MVC Architecture:** Structured separation of concerns using Spring Controllers, Services, and Repositories.

## Tech Stack
- **Backend:** Java 21, Spring Boot, Spring Data JPA, Hibernate
- **Database:** PostgreSQL
- **Frontend:** Thymeleaf, HTML5, CSS3, Bootstrap 5
- **Build Tool & Control:** Maven, Git, GitHub
- **IDE:** Eclipse

## Getting Started

### Prerequisites
- JDK 21
- PostgreSQL
- Maven

### Database Setup
1. Create a database named `todo_db` in PostgreSQL.
2. Update `src/main/resources/application.properties` with your database credentials:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/todo_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update