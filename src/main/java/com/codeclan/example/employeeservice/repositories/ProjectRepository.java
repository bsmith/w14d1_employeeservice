package com.codeclan.example.employeeservice.repositories;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
