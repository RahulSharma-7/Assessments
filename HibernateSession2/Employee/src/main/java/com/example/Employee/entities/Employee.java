package com.example.Employee.entities;

import javax.persistence.*;

@Entity
@Table(name="employeeTable")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="empId")
    private int id;
    @Column(name="empLastName")
    private String lastName;
    @Column(name="empFirstName")
    private String firstName;
    @Column(name="empAge")
    private Integer age;
    @Column(name="empSalary")
    private Double salary;

    public Employee() {
    }

    public Employee(String firstName , String lastName, Integer age, Double salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
