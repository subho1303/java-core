package com.learning.core.day5;

import java.util.Objects;
import java.util.TreeSet;

class Employee1 implements Comparable<Employee1> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee1(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee1 Employee1 = (Employee1) obj;
        return id == Employee1.id;
    }

    @Override
    public int compareTo(Employee1 o) {
        return Integer.compare(this.id, o.id);
    }
}

public class D05P09 {
    public static void main(String[] args) {
        TreeSet<Employee1> people = new TreeSet<>();
        people.add(new Employee1(1, "Sanjay", 30, 4000));
        people.add(new Employee1(2, "Raju", 35, 8000));
        people.add(new Employee1(3, "Kamal", 25, 2000.50));
        people.add(new Employee1(4, "Ankush", 28, 3000.60));

        double totalSalary = 0;
        for (Employee1 Employee1 : people) {
            totalSalary += Employee1.getSalary();
        }
        System.out.println(totalSalary);
    }
}
