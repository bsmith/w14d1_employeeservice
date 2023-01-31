package com.codeclan.example.employeeservice.controllers;

import com.codeclan.example.employeeservice.models.Department;
import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping(value = "/departments")
    public List<Department> findAllDepartments() {
        return departmentRepository.findAll();
    }

    @GetMapping(value = "/departments/{id}")
    public Optional<Department> findOneDepartments(@PathVariable Long id) {
        return departmentRepository.findById(id);
    }

    @GetMapping(value = "/departments/{id}/employees")
    public List<Employee> findEmployeesInDepartment(@PathVariable Long id) {
        Optional<Department> department = departmentRepository.findById(id);
        if (department.isPresent()) {
            return department.get().getEmployees();
        } else {
            return new ArrayList<>();
        }
    }
}
