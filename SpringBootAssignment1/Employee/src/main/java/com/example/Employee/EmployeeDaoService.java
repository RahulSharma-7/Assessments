package com.example.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeDaoService {

    private static List<Employee> employeesList= new ArrayList<>();
    private static Integer employeeCount=3;

    static
    {
        employeesList.add(new Employee("rahul",1,22));
        employeesList.add(new Employee("sharma",2,22));
        employeesList.add(new Employee("rahul",3,23));

    }


    public List<Employee> getEmployeesList()
    {
        return employeesList;
    }

    public Employee getEmployee(Integer id)
    {
        for (Employee employee:employeesList)
        {
            if(employee.getId()==id)
                return employee;
        }
        return null;
    }

    public Employee addEmployee(Employee employee)
    {
       if(employee.getId()==null)
       {
           employee.setId(++employeeCount);
       }
        employeesList.add(employee);
        return employee;

    }


    public Employee deleteEmployee(Integer id)
    {
        Iterator<Employee> iterator = employeesList.iterator();
        while(iterator.hasNext())
        {Employee employee = iterator.next();
            if(employee.getId()==id)
            {

                iterator.remove();
                return employee;
            }
        }
        return null;
    }




}
