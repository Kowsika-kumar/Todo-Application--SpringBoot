✅ Todo Application – Spring Boot

A simple RESTful Todo Application built using Spring Boot that allows users to manage tasks efficiently.
This project demonstrates CRUD operations, Spring Data JPA, and a clean layered architecture suitable for beginners and interview preparation.

📌 Features

Create new Todo items

Retrieve all Todo items

Retrieve Todo by ID

Update existing Todo

Delete Todo

RESTful API design

Clean separation of concerns (Controller, Service, Repository)

🛠️ Tech Stack
Category	Technology
Language	Java
Framework	Spring Boot
ORM	Spring Data JPA
Database	H2 / MySQL (configurable)
Build Tool	Maven
API Testing	Postman
IDE	IntelliJ IDEA
📂 Project Structure
Todo-Application--SpringBoot
│
├── .mvn/wrapper
├── src
│   ├── main
│   │   ├── java/todo/kowsi/sample
│   │   │   ├── models
│   │   │   │   └── Todo.java
│   │   │   ├── TodoApplication.java
│   │   │   ├── TodoController.java
│   │   │   ├── TodoRepository.java
│   │   │   └── TodoService.java
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test/java/todo/kowsi/sample
│
├── .gitignore
├── mvnw
├── mvnw.cmd
└── pom.xml

🧩 Architecture Overview
Client (Postman / Browser)
        ↓
Controller (REST APIs)
        ↓
Service (Business Logic)
        ↓
Repository (JPA)
        ↓
Database

🌐 REST API Endpoints
🔹 Get All Todos

GET

/todos

🔹 Get Todo by ID

GET

/todos/{id}

🔹 Create Todo

POST

/todos


Request Body

{
  "title": "Learn Spring Boot",
  "completed": false
}

🔹 Update Todo

PUT

/todos/{id}


Request Body

{
  "title": "Learn Spring Boot Deeply",
  "completed": true
}

🔹 Delete Todo

DELETE

/todos/{id}

🗄️ Database Configuration
Default (H2 – In-Memory)
spring.datasource.url=jdbc:h2:mem:testdb
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true

MySQL (Optional)
spring.datasource.url=jdbc:mysql://localhost:3306/tododb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

▶️ How to Run the Application
1️⃣ Clone the Repository
git clone https://github.com/Kowsika-kumar/Todo-Application--SpringBoot.git

2️⃣ Navigate to Project
cd Todo-Application--SpringBoot

3️⃣ Run the Application
mvn spring-boot:run


OR
Run TodoApplication.java directly from IntelliJ IDEA.

🧪 Testing the APIs

Use Postman

Set Header:

Content-Type: application/json


Test GET, POST, PUT, DELETE endpoints

🚀 Future Enhancements

Add DTO & Mapper layers

Validation using @Valid

Global exception handling

Swagger/OpenAPI documentation

Authentication (JWT)

Frontend using React or Angular

👩‍💻 Author

Kowsika K
Electronics & Communication Engineering
Skills: Java, Spring Boot, MySQL, HTML, CSS, JavaScript, React

⭐ Why This Project?

This project demonstrates:

Core Spring Boot concepts

REST API development

CRUD operations

Clean and readable code structure

Beginner to intermediate backend skills
