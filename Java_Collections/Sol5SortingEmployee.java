
//Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
String name;
int age;
Double salary;
public Employee (String name,int age,Double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
}
public String toString(){
    return " Name: "+this.name+"  Age: "+this.age+" Salary: "+this.salary;
}
}

public class Sol5SortingEmployee {

public static void main(String args[])
{

    List<Employee> list = new ArrayList<Employee>();

        list.add( new Employee("sam",29,12500.500));
        list.add(new Employee("max",29,12501.500));
        list.add(new Employee("nick",29,10500.500));
        list.add(new Employee("mathew",29,13500.500));

    Collections.sort(list, new Comparator<Employee>() {
        @Override
        public int compare(Employee employee, Employee t1) {
            return employee.salary.compareTo(t1.salary);
        }
    });
    System.out.println(list);

}

}
