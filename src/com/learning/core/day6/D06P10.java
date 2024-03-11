package com.learning.core.day6;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
    }
}

public class D06P10 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        Employee employee1 = new Employee(1, "Daniel", "L&D", "Analyst");
        Employee employee2 = new Employee(2, "Thomas", "Testing", "Tester");
        Employee employee3 = new Employee(3, "Robert", "Development", "Product Manager");
        Employee employee4 = new Employee(4, "Grace", "HR", "Tech Support");

        employeeTable.put(employee1.hashCode(), employee1);
        employeeTable.put(employee2.hashCode(), employee2);
        employeeTable.put(employee3.hashCode(), employee3);
        employeeTable.put(employee4.hashCode(), employee4);

        // Verify whether the HashTable is empty or not
        System.out.println(employeeTable.isEmpty());
    }
}