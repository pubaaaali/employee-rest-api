package com.example.rest_service;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class Employees {

    @JsonProperty("Employees")
    private List<Employee> employeeList;

    public Employees() {
        this.employeeList = new ArrayList<>();
    }
    
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

}
