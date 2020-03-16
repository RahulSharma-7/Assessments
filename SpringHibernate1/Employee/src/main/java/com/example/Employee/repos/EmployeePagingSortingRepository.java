package com.example.Employee.repos;

import com.example.Employee.employeeEntity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeePagingSortingRepository extends PagingAndSortingRepository<Employee,Integer> {

}
