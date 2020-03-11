package com.example.Employee;

public class Employee {
    private String name;
    private Integer id;
    private int age;



    public Employee(String name, Integer id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
