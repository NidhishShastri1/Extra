# Thymeleaf Web Application

A simple web application built with **Spring Boot** and **Thymeleaf** for server-side rendering.  
It demonstrates the use of Spring MVC, model binding, form handling, and dynamic page rendering.

---

## 🚀 Features

- Dynamic HTML rendering using Thymeleaf  
- MVC architecture with Spring Boot  
- Form submission and validation  
- CRUD operations (Create, Read, Update, Delete)  
- Integration with database using Spring Data JPA  
- Responsive and minimal UI  

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot (Java)
- **Frontend:** Thymeleaf, HTML5, CSS3
- **Database:** MySQL / H2 (for testing)
- **Build Tool:** Maven / Gradle

---

2. Configure the database

Update application.properties with your database details:

spring.datasource.url=jdbc:mysql://localhost:3306/thymeleaf_demo
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.thymeleaf.cache=false


3. Build and run the project

Using Maven:

mvn spring-boot:run


4. Access the application

Open your browser and go to:

http://localhost:8080



