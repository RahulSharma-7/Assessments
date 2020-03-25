package com.example.Employee.repos;

import com.example.Employee.entities.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {





    @Query("from Employee")
    List<Employee> findAllEmployees(Pageable pageable);
    @Query("select firstName,lastName from Employee")
    List<Object[]> findAllStudentsPartialData();
    @Query("from Employee where firstName=:firstName")
    List<Employee> findAllEmployeeWithFirstName(@Param("firstName")String firstName);
    @Query("from Employee where age>:age")
    List<Employee>  findEmployeeForGivenAge(@Param("age") Integer age);




    //JPQL Assignment questions

    @Query("select firstName,lastName from Employee e where e.salary>(select avg(salary) from Employee) order by e.age asc , e.salary desc")
    List<Object[]> findEmployees();


    @Query("select avg(salary) from Employee")
    Double averageSalary();


    @Transactional
    @Modifying
    @Query("update Employee e set e.salary=:Salary where e.salary<:averageSalary")
    void updateEmployees(@Param("Salary") Double Salary,@Param("averageSalary") Double averageSalary);

    @Query("select min(salary) from Employee")
    Double minimumSalary();

    @Modifying
    @Transactional
    @Query("delete from Employee where salary=:minsalary")
    void deleteEmployeeWithMinimumSalary(@Param("minsalary") Double minsalary);

    @Query(value="select empId,empFirstName,empAge from employeeTable where empLastName like '%singh' ",nativeQuery = true)
    List<Object[]> findEmployeeWithLastNameNQ();

    @Query(value="delete from employeeTable where empAge>:age",nativeQuery = true)
    @Transactional
    @Modifying
    void deleteIfAgeIsGreater(@Param("age") Integer age);

}
