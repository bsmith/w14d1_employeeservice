package com.codeclan.example.employeeservice.controllers;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.models.Project;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import com.codeclan.example.employeeservice.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {
    @Autowired
    ProjectRepository projectRepository;

    @GetMapping(value = "/projects")
    public List<Project> findAllProjects() {
        return projectRepository.findAll();
    }

    @GetMapping(value = "/projects/{id}")
    public Optional<Project> findOneEmployee(@PathVariable Long id) {
        return projectRepository.findById(id);
    }
}
