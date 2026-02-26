package com.example.rest_service;

import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.ArrayList;

@Component
public class EmployeeManager {

    private final Employees employees;

    public EmployeeManager() {
        employees = new Employees();
        employees.setEmployeeList(new ArrayList<>(Arrays.asList(
            new Employee("E001", "Alice", "Johnson", "alice.johnson@company.com", "Software Engineer"),
            new Employee("E002", "Bob", "Smith", "bob.smith@company.com", "Project Manager"),
            new Employee("E003", "Carol", "Williams", "carol.williams@company.com", "Data Analyst"),
            new Employee("E004", "David", "Brown", "david.brown@company.com", "DevOps Engineer")
        )));
    }

    public Employees getEmployees() {
        return employees;
    }
}