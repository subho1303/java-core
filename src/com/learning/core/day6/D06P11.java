package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Objects;

class Emp02 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Emp02(int id, String name, String department, String designation) {
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
        Emp02 Emp02 = (Emp02) o;
        return id == Emp02.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

class D06P11 {
    public static void main(String[] args) {
        Hashtable<Integer, Emp02> Emp02s = new Hashtable<>();

        Emp02s.put(1001, new Emp02(1001, "Daniel", "Analyst", "L&D"));
        Emp02s.put(1002, new Emp02(1002, "Thomas", "Tester", "Testing"));
        Emp02s.put(1003, new Emp02(1003, "Robert", "Product Manager", "Development"));
        Emp02s.put(1004, new Emp02(1004, "Grace", "Tech Support", "HR"));

        int searchId = 1003;

        Emp02 foundEmp02 = Emp02s.get(searchId);
        if (foundEmp02 != null) {
            System.out.println(foundEmp02);
        } else {
            System.out.println("Emp02 with ID " + searchId + " not found.");
        }
    }
}