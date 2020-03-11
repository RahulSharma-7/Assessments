package com.example.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeDaoService employeeService;


    //Get /employees  -->List<Employee> getAllEmployees();
    //Get /employees/{id} ---> Employee getEmployee(id);
    //Post /employees   --->addEmployee(user);

    @GetMapping("/employees")
    List<Employee> getAllEmployees() {


        return employeeService.getEmployeesList();


    }

    @GetMapping("/employees/{id}")
    Employee getEmployee(@PathVariable Integer id) {
        Employee employee = employeeService.getEmployee(id);
        if(employee==null)
        {
            throw new UserNotFoundException("id- "+id);
        }

            return employee;

    }

    @PostMapping("/employees")
  public  ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {

        Employee savedEmployee = employeeService.addEmployee(employee);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEmployee.getId()).toUri();
        return ResponseEntity.created(location).build();


    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id)
    {
       Employee employee = employeeService.deleteEmployee(id);
       if(employee==null)
            throw new UserNotFoundException("id-"+id);
    }

}
