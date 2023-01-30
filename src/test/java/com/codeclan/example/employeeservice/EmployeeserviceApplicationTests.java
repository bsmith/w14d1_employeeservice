package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;

	@BeforeAll
	public static void beforeAll() {
		System.out.println("beforeAll");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("beforeEach");
	}

	@Test
	void contextLoads() {
		System.out.println("contextLoads");
	}

	@Test
	public void createEmployee() {
		System.out.println("createEmployee");
		Employee jack = new Employee("Jack Sparrow", 32, "PiecesOfEight", "jack@notapirate.com");
		employeeRepository.save(jack);
	}

}
