# Secure Information Management System

A Spring Boot backend project that manages user authentication and role-based access control using PostgreSQL and Spring Security. Designed as a secure, scalable foundation for enterprise-level information systems.

---

## 🔐 Features

- User Login/Logout functionality
- Role-based access control using Spring Security
- Secure password storage
- RESTful API for managing users and secure information
- PostgreSQL database integration
- Clean architecture (Controller → Service → Repository)
- Lombok for boilerplate code reduction

---

## 🛠 Tech Stack

- Java 17
- Spring Boot
- Spring Security
- PostgreSQL
- Maven
- Lombok

---

## 🚀 How to Run the Project

1. **Clone the repository:**
   ```bash
   git clone https://github.com/YOUR_USERNAME/secure-information-management-system.git
   cd secure-information-management-system
2. **Configure PostgreSQL:**

Create a PostgreSQL database named secure_db
Update the src/main/resources/application.properties with your PostgreSQL credentials:
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/secure_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```
3. **Run the project:**

```bash
./mvnw spring-boot:run
```
4. **Access the application:**
```bash
http://localhost:8080
```


API Endpoints

| Method | Endpoint     | Description          |
| ------ | ------------ | -------------------- |
| POST   | `/login`     | User login           |
| GET    | `/info`      | List all secure info |
| POST   | `/info`      | Create new record    |
| PUT    | `/info/{id}` | Update record        |
| DELETE | `/info/{id}` | Delete record        |

Sample Login

| Username | Password   |
| -------- | ---------- |
| `admin`  | `password` |

