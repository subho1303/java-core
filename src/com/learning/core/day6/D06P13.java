package com.learning.core.day6;

import java.util.Hashtable;

class Employee4 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee4(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee4{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee4 Employee4 = (Employee4) o;
        return id == Employee4.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class D06P13 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee4> Employee4Hashtable = new Hashtable<>();

       
        Employee4 emp1 = new Employee4(1, "John Doe", "Engineering", "Software Engineer");
        Employee4 emp2 = new Employee4(2, "Jane Smith", "Marketing", "Marketing Manager");
        Employee4 emp3 = new Employee4(3, "Alice Johnson", "HR", "HR Manager");
        Employee4 emp4 = new Employee4(4, "Bob Brown", "Finance", "Financial Analyst");
        Employee4 emp5 = new Employee4(5, "James Bond", "Development", "Product Manager");

       
        Employee4Hashtable.put(emp1.hashCode(), emp1);
        Employee4Hashtable.put(emp2.hashCode(), emp2);
        Employee4Hashtable.put(emp3.hashCode(), emp3);
        Employee4Hashtable.put(emp4.hashCode(), emp4);
        Employee4Hashtable.put(emp5.hashCode(), emp5);

        
        System.out.println(Employee4Hashtable.size());
    }
}
