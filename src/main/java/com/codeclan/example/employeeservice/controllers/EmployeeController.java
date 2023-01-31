package com.codeclan.example.employeeservice.controllers;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/employees/{id}")
    public Optional<Employee> findOneEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

//    @DeleteMapping(value = "/employees/{id}")
//    public void deleteEmployeeById(@PathVariable Long id) {
//        employeeRepository.deleteById(id);
//    }
//
//    @PostMapping(value = "/employees")
//    public void createEmployee() {
//        Employee employee = new Employee("Random Person", 25, "RANDOM", "random@example.com");
//        employeeRepository.save(employee);
//    }
}
