package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Department;
import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.models.Project;
import com.codeclan.example.employeeservice.repositories.DepartmentRepository;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import com.codeclan.example.employeeservice.repositories.ProjectRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

//	@BeforeAll
//	public static void beforeAll() {
//		System.out.println("beforeAll");
//	}
//
//	@BeforeEach
//	public void beforeEach() {
//		System.out.println("beforeEach");
//	}

	@Test
	void contextLoads() {
		System.out.println("contextLoads");
	}

//	@Test
//	public void createEmployee() {
//		System.out.println("createEmployee");
//		Employee jack = new Employee("Jack Sparrow", 32, "PiecesOfEight", "jack@notapirate.com");
//		employeeRepository.save(jack);
//	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department = new Department("Stock Control");
		departmentRepository.save(department);

		Employee employee = new Employee("Karen", 45, "ABC123", "email@email", department);
		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeesAndProjects() {
		Department department = new Department("Frontend");
		departmentRepository.save(department);

		Employee employee = new Employee("John", 55, "XYZ123", "email@email", department);
		employeeRepository.save(employee);

		Project project = new Project("Gap scan", 12);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);
	}

}
