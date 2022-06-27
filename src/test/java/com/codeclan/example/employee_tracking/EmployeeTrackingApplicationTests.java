package com.codeclan.example.employee_tracking;

import com.codeclan.example.employee_tracking.models.Employee;
import com.codeclan.example.employee_tracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee = new Employee("Em Ploy-Ee", 26, "employee26", "employee26@employee.com");
		employeeRepository.save(employee);
	}



}
