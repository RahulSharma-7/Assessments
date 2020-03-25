package com.example.Employee;

import com.example.Employee.entities.Employee;
import com.example.Employee.repos.EmployeeRepository;
import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class DemoApplicationTests {

@Autowired
	EmployeeRepository repository;
	@Test
	void contextLoads() {
	}
	@Test
	@Order(1)
	void testCreateEmployee()
	{

		repository.save(new Employee("Rahul" ,"Sharma",23,1000.0));
		repository.save(new Employee("Michael" ,"singh",31,10000.0));

		repository.save(new Employee("Rahul" ,"Gautam",23,1000.0));
		repository.save(new Employee("Michael" ,"Jordan",33,10000.0));

		repository.save(new Employee("michael" ,"Sharma",43,1000.000));
		repository.save(new Employee("Charles" ,"Jordan",52,10000.0));

		repository.save(new Employee("michael" ,"Sharma",49,1000.000));
		repository.save(new Employee("Charles" ,"Jordan",38,10000.0));
	}



	@Test
	@Order(2)
	void testFindAllEmployees()
	{
		repository.findAllEmployees(PageRequest.of(1,3, Sort.Direction.DESC,"id")).forEach(System.out::println);
	}


	@Test
	@Order(3)
	void findAllStudentsPartialData()
	{
		repository.findAllStudentsPartialData().forEach(e-> System.out.println(e[0]+" "+e[1]));
	}

	@Test
	@Order(4)
	void testFindAllEmployeesByFirstName()
	{
		repository.findAllEmployeeWithFirstName("Rahul").forEach(e-> System.out.println(e));
	}
	@Test
	@Order(5)
	void testFindEmployeeForGivenAge()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		repository.findEmployeeForGivenAge(33).forEach(e-> System.out.println(e));
	}

//	@Test
//	@Order(6)
//	@Rollback(false)
//	@Transactional
//	void testDeleteEmployeeWithMinimumSalary()
//	{
//		Double salary = repository.minimumSalary();
//		repository.deleteEmployeeWithMinimumSalary(salary);
//	}


	@Test
	@Order(7)
	void testEmployeeWithSalaryGreaterThanAverage()
	{
		System.out.println(">>>>>>>>>>>>>>> Question 1 <<<<<<<<<<<<<<<<<<<<<<<");
	      List<Object[]> list = repository.findEmployees();
	      for(Object[] temp:list)

		  {
			  System.out.println(temp[0] +" "+ temp[1]);
		  }

	}
//
//	@Test
//	@Order(8)
//	@Transactional
//	@Rollback(false)
//	void testUpdateEmployeeSalary()
//	{
//			Double averagesalary = repository.averageSalary();
//			repository.updateEmployees(12000.0,averagesalary);
//
//	}
//


	@Test
	@Order(8)

	void findEmployeeWithLastNameNativeQuery()
	{

		System.out.println(">>>>>>>>>>>>>>>>>>>>NativeQuery<<<<<<<<<<<<<<<<<<<<<");
		List<Object[]> list = repository.findEmployeeWithLastNameNQ();
		list.forEach(e-> System.out.println(e[0]+ " "+e[1]+ " "+e[2]+" "));
	}



	@Test
	@Order(9)
	@Rollback(false)
	void deleteEmployeeOnAgeBasis()
	{
		repository.deleteIfAgeIsGreater(45);
	}



}
