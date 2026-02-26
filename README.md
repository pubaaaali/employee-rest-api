# Employee REST API

A RESTful web service built with **Java Spring Boot** that manages employee data. Supports creating and retrieving employee records via HTTP requests, with full unit test coverage using **JUnit 5** and **Mockito**.

## Features

- **GET** `/employees` — Retrieve all employees as JSON
- **POST** `/employees` — Add a new employee via JSON request body

## Tech Stack

- Java 17
- Spring Boot 3.2
- Maven
- JUnit 5 & Mockito (testing)

## Getting Started

### Prerequisites

- Java 17+
- Maven (or use the included Maven wrapper)

### Run the application

```bash
./mvnw spring-boot:run
```

The server starts at `http://localhost:8080`.

### Example requests

**Get all employees:**
```bash
curl http://localhost:8080/employees
```

**Add a new employee:**
```bash
curl -X POST http://localhost:8080/employees \
  -H "Content-Type: application/json" \
  -d '{
    "employee_id": "E005",
    "first_name": "Emma",
    "last_name": "Wilson",
    "email": "emma.wilson@company.com",
    "title": "UX Designer"
  }'
```

### Run tests

```bash
./mvnw test
```

## Project Structure

```
src/
├── main/java/com/example/rest_service/
│   ├── RestServiceApplication.java    # Application entry point
│   ├── Employee.java                  # Employee data model
│   ├── Employees.java                 # Employee list wrapper
│   ├── EmployeeManager.java           # Data initialization
│   └── EmployeeController.java        # REST controller (GET & POST)
└── test/java/com/example/rest_service/
    ├── EmployeeTest.java              # Model unit tests
    ├── EmployeeManagerTest.java       # Manager unit tests
    └── EmployeeControllerTest.java    # Controller tests (Mockito)
```

## API Response Format

```json
{
    "Employees": [
        {
            "employee_id": "E001",
            "first_name": "Alice",
            "last_name": "Johnson",
            "email": "alice.johnson@company.com",
            "title": "Software Engineer"
        }
    ]
}
```
