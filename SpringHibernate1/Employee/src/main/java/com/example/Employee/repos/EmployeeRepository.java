package com.example.Employee.repos;

import com.example.Employee.employeeEntity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    List<Employee> findAll();
    Optional<List<Employee>> findByName(String name);
    Optional<List<Employee>> findByAgeBetween(Integer fromRange, Integer toRange);
    Optional<List<Employee>> findByNameLike(String name);
}
