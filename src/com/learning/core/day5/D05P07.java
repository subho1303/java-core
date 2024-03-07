package com.learning.core.day5;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Employee2 implements Comparable<Employee2> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee2(int id, String name, int age, double salary) {
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
        return id + " " + name + " " + salary;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 Employee2 = (Employee2) o;
        return id == Employee2.id &&
                age == Employee2.age &&
                Double.compare(Employee2.salary, salary) == 0 &&
                Objects.equals(name, Employee2.name);
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    
    @Override
    public int compareTo(Employee2 o) {
        return Integer.compare(this.id, o.getId());
    }
}

public class D05P07 {
    public static void main(String[] args) {
        Set<Employee2> people = new TreeSet<>();
        people.add(new Employee2(1, "Jerry", 30, 999.0));
        people.add(new Employee2(2, "Smith", 45, 2999.0));
        people.add(new Employee2(3, "Popeye", 35, 5999.0));
        people.add(new Employee2(4, "Jones", 40, 6999.0));
        people.add(new Employee2(5, "John", 25, 1999.0));
        people.add(new Employee2(6, "Tom", 35, 3999.0));

        
        for (Employee2 Employee2 : people) {
            System.out.println(Employee2);
        }
    }
}
