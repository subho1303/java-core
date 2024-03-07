package com.learning.core.day5;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee Employee = (Employee) o;
        return id == Employee.id &&
                age == Employee.age &&
                Double.compare(Employee.salary, salary) == 0 &&
                Objects.equals(name, Employee.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    
    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }
}

public class D05P08 {
    public static void main(String[] args) {
        List<Employee> people = Arrays.asList(
                new Employee(1, "Jerry", 30, 50000),
                new Employee(2, "Smith", 45, 60000),
                new Employee(3, "Popeye", 35, 55000),
                new Employee(4, "Jones", 40, 70000),
                new Employee(5, "John", 25, 45000),
                new Employee(5, "Tom", 28, 40000)
        );

        
        people.stream()
                .map(Employee -> Employee.getName().toUpperCase())
                .forEach(System.out::println);
    }
}