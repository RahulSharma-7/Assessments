package com.example.Employee;

import com.example.Employee.employeeEntity.Employee;
import com.example.Employee.repos.EmployeePagingSortingRepository;
import com.example.Employee.repos.EmployeeRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoApplicationTests {
    @Autowired
    EmployeeRepository repository;
    @Autowired
	EmployeePagingSortingRepository pagingSortingRepository;

    @Test
    void contextLoads() {
    }

    @Test
	@Order(1)
    void createEmployeeTest() {
        Employee employee = new Employee();
        employee.setName("Rahul");
        employee.setId(1);
        employee.setAge(33);
        employee.setLocation("Noida");
        repository.save(employee);

        Employee employee1 = new Employee();
        employee1.setName("Rahul");
        employee1.setId(2);
        employee1.setAge(30);
        employee1.setLocation("Noida");
        repository.save(employee1);

		Employee employee2 = new Employee();
		employee2.setName("Michael");
		employee2.setId(3);
		employee2.setAge(29);
		employee2.setLocation("Noida");
		repository.save(employee2);

		Employee employee4 = new Employee();
		employee4.setName("ASharma");
		employee4.setId(4);
		employee4.setAge(22);
		employee4.setLocation("Lucknow");
		repository.save(employee4);
    }

    @Test
	@Order(2)
    void testRead() {
        Optional<Employee> employee = repository.findById(2);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Name: " + employee.get().getName() + " Id: " + employee.get().getId() + " Age: " + employee.get().getAge() + " Location: " + employee.get().getLocation());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    @Test
	@Order(3)
	void testUpdate()
	{
		Employee employee = repository.findById(2).get();
		employee.setLocation("Delhi");
		repository.save(employee);
	}

	@Test
	@Order(4)
	void testdisplayAllEmployee()
	{
		repository.findAll().forEach(e->  System.out.println("Name: " + e.getName() + " Id: " + e.getId() + " Age: " + e.getAge() + " Location: " + e.getLocation()));
	}

	@Test
	@Order(5)
	void testDelete() {
		if (repository.existsById(8)) {
			System.out.println("Deleting the employee");
			repository.deleteById(3);
		}
	}
	@Test
	@Order(6)
	void testdisplayAllEmployeeLater()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		repository.findAll().forEach(e->  System.out.println("Name: " + e.getName() + " Id: " + e.getId() + " Age: " + e.getAge() + " Location: " + e.getLocation()));
	}

	@Test
	@Order(7)
	void testCount()
	{
		System.out.println("Total number of employees are: "+repository.count());
	}

	@Test
	@Order(8)
	void testFindByName()
	{
		List<Employee> list = repository.findByName("rahul").get();
		System.out.println(list);
	}

	@Test
	@Order(9)
	void testFindByAgeBetween()
	{

		if(repository.findByAgeBetween(33,38)==null)
		{
			System.out.println("NO ENTRY FOUND");
		}
		else{
			List<Employee> list = repository.findByAgeBetween(33,38).get();
			System.out.println(list);
		}

	}

	@Test
	@Order(10)
	void testFindWithNameA()
	{
		List<Employee> list = repository.findByNameLike("A%").get();
		System.out.println(list);
	}

	@Test
	@Order(11)
	void testPagingSortingEmployee()
	{
		Pageable pageable =  PageRequest.of(0,2, Sort.Direction.ASC,"age");
		Page<Employee> page = pagingSortingRepository.findAll(pageable);
		page.forEach(p-> System.out.println(p));
	}




}
