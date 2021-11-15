package com.example.oauthresource.controller;

import com.example.oauthresource.model.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping(value = "/user/getEmployeeList", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Employee.builder().empId("123").empName("Ranjith").build());
        return employeeList;
    }
}
