package com.example.rest_service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testEmployeeConstructorAndGetters() {
        Employee employee = new Employee("E001", "Alice", "Johnson", "alice@company.com", "Engineer");

        assertEquals("E001", employee.getEmployeeId());
        assertEquals("Alice", employee.getFirstName());
        assertEquals("Johnson", employee.getLastName());
        assertEquals("alice@company.com", employee.getEmail());
        assertEquals("Engineer", employee.getTitle());
    }

    @Test
    public void testEmployeeSetters() {
        Employee employee = new Employee();

        employee.setEmployeeId("E002");
        employee.setFirstName("Bob");
        employee.setLastName("Smith");
        employee.setEmail("bob@company.com");
        employee.setTitle("Manager");

        assertEquals("E002", employee.getEmployeeId());
        assertEquals("Bob", employee.getFirstName());
        assertEquals("Smith", employee.getLastName());
        assertEquals("bob@company.com", employee.getEmail());
        assertEquals("Manager", employee.getTitle());
    }

    @Test
    public void testEmptyConstructorCreatesNullFields() {
        Employee employee = new Employee();

        assertNull(employee.getEmployeeId());
        assertNull(employee.getFirstName());
    }
}