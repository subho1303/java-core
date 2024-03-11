package com.learning.core.day6;

import java.util.Hashtable;

class Employee11 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee11(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return id + " " + name + " "+designation+ " " + department;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee11 Employee11 = (Employee11) obj;
        return id == Employee11.id;
    }
}

public class D06P12 {
    private static final int Integer = 0;
	private static final String List = null;
	private static final int Map = 0;

	public static void main(String[] args) {
        Hashtable<Integer, Employee11> Employee11Hashtable = new Hashtable<>();

       
        Employee11 emp1 = new Employee11(1001, "Daniel", "L&D", "Analyst");
        Employee11 emp2 = new Employee11(1002, "Thomas", "", "Tester");
        Employee11 emp3 = new Employee11(1003, "Robert", "Development", "Product Manager");
        Employee11 emp4 = new Employee11(1004, "Grace", "HR", "Tech Support");

        
        Employee11Hashtable.put(emp1.hashCode(), emp1);
        Employee11Hashtable.put(emp2.hashCode(), emp2);
        Employee11Hashtable.put(emp3.hashCode(), emp3);
        Employee11Hashtable.put(emp4.hashCode(), emp4);

       
        addEmployee11IfNotExists(Employee11Hashtable, 1005, "Charles", "Lead Testing","QA");

        
        for (Employee11 emp : Employee11Hashtable.values()) {
            System.out.println(emp);
        }
    }

    private static void addEmployee11IfNotExists(Hashtable<Integer, Employee11> Employee11Hashtable,
                                               int id, String name, String department, String designation) {
        Employee11 newEmployee11 = new Employee11(id, name, department, designation);
        if (!Employee11Hashtable.containsKey(id)) {
            Employee11Hashtable.put(id, newEmployee11);
        }
      
    }
}