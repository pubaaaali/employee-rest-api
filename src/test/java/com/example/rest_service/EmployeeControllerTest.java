package com.example.rest_service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeControllerTest {

    private EmployeeController controller;
    private EmployeeManager mockManager;
    private Employees employees;

    @BeforeEach
    public void setUp() {
        mockManager = mock(EmployeeManager.class);
        employees = new Employees();
        employees.setEmployeeList(new ArrayList<>(Arrays.asList(
            new Employee("E001", "Alice", "Johnson", "alice@company.com", "Engineer"),
            new Employee("E002", "Bob", "Smith", "bob@company.com", "Manager")
        )));
        when(mockManager.getEmployees()).thenReturn(employees);
        controller = new EmployeeController(mockManager);
    }

    @Test
    public void testGetAllEmployees() {
        Employees result = controller.getAllEmployees();

        assertEquals(2, result.getEmployeeList().size());
        assertEquals("Alice", result.getEmployeeList().get(0).getFirstName());
    }

    @Test
    public void testAddEmployee() {
        Employee newEmp = new Employee("E003", "Carol", "Williams", "carol@company.com", "Analyst");

        Employees result = controller.addEmployee(newEmp);

        assertEquals(3, result.getEmployeeList().size());
        assertEquals("Carol", result.getEmployeeList().get(2).getFirstName());
    }

    @Test
    public void testAddEmployeePreservesExisting() {
        Employee newEmp = new Employee("E003", "Carol", "Williams", "carol@company.com", "Analyst");

        controller.addEmployee(newEmp);

        assertEquals("Alice", employees.getEmployeeList().get(0).getFirstName());
        assertEquals("Bob", employees.getEmployeeList().get(1).getFirstName());
    }
}