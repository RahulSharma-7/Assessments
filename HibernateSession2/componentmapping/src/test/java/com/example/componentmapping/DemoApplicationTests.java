package com.example.componentmapping;

import com.example.componentmapping.entities.Employee;
import com.example.componentmapping.entities.Salary;
import com.example.componentmapping.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
@Autowired
	EmployeeRepository repository;
	@Test
	void contextLoads() {
	}
	@Test
	void createEmployeeTest()
	{
		Employee employee = new Employee();
		employee.setAge(22);
		employee.setFirstName("Michael");
		employee.setLastName("Schumacher");

		Salary salary = new Salary();
		salary.setBasicSalary(100.0);
		salary.setBonusSalary(50.0);
		salary.setSpecialAllowanceSalary(10.0);
		salary.setTaxAmount(25.0);
		employee.setSalary(salary);

		repository.save(employee);
	}

}
