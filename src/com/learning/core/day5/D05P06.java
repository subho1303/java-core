package com.learning.core.day5;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Employee3 implements Comparable<Employee3> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee3(int id, String name, int age, double salary) {
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
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee3 Employee3 = (Employee3) o;
        return id == Employee3.id &&
                age == Employee3.age &&
                Double.compare(Employee3.salary, salary) == 0 &&
                Objects.equals(name, Employee3.name);
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    
    @Override
    public int compareTo(Employee3 o) {
        return Integer.compare(this.id, o.getId());
    }
}

public class D05P06 {
    public static void main(String[] args) {
        Set<Employee3> people = new TreeSet<>();
        people.add(new Employee3(1, "Jerry", 22, 999.0));
        people.add(new Employee3(2, "Smith", 24, 2999.0));
        people.add(new Employee3(3, "Popeye", 23, 5999.0));
        people.add(new Employee3(4, "Jones", 22, 6999.0));
        people.add(new Employee3(5, "John", 32, 1999.0));
        people.add(new Employee3(6, "Tom", 42, 3999.0));

        
        for (Employee3 Employee3 : people) {
            if (Employee3.getAge() > 25) {
                System.out.println(Employee3);
            }
        }
    }
}