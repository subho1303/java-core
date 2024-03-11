package com.learning.core.day6;

import java.util.HashMap;
import java.util.Objects;

import java.util.Collection;
import java.util.Hashtable;

 class Emp {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Emp(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %s", id, name, department, designation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp Emp = (Emp) o;
        return id == Emp.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

 class D06P14 {
    public static void main(String[] args) {
        Hashtable<Integer, Emp> currentEmps = new Hashtable<>();
        currentEmps.put(1001, new Emp(1001, "Daniel", "Analyst", "L&D"));
        currentEmps.put(1002, new Emp(1002, "Thomas", "Tester", "Testing"));
        currentEmps.put(1003, new Emp(1003, "Robert", "Product Manager", "Development"));
        currentEmps.put(1004, new Emp(1004, "Grace", "Tech Support", "HR"));

        Hashtable<Integer, Emp> existingEmps = new Hashtable<>();
        existingEmps.put(1005, new Emp(1005, "Charles", "QA Lead", "Testing"));
        existingEmps.put(1006, new Emp(1006, "Henry", "Accountant", "Finance"));

        existingEmps.putAll(currentEmps);

        for (Emp Emp : existingEmps.values()) {
            System.out.println(Emp);
        }
    }
}
