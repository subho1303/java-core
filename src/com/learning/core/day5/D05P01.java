package com.learning.core.day5;

import java.util.Random;

class Register<T> {
    private String registerId;

    public Register(String registerId) {
        this.registerId = registerId;
    }

    public String generateRegisterId(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    public void display(T user) {
        if (user instanceof Employee4) {
            Employee4 Employee4 = (Employee4) user;
            System.out.println(generateRegisterId(7) + " " + Employee4.getName() + " " + Employee4.getPhoneNo() + " " + Employee4.getEmployee4Id() + " " + Employee4.getPassportNo());
        } else if (user instanceof Student) {
            Student student = (Student) user;
            System.out.println(generateRegisterId(7) + " " + student.getName() + " " + student.getPhoneNo() + " " + student.getLicenseNo() + " " + student.getPanCardNo());
        }
    }
}

class Employee4 {
    private String name;
    private long phoneNo;
    private int Employee4Id;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;

    public Employee4(String name, long phoneNo, int Employee4Id, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.Employee4Id = Employee4Id;
        this.passportNo = passportNo;
    }

    public Employee4(String name, long phoneNo, int Employee4Id, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.Employee4Id = Employee4Id;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Employee4(String name, long phoneNo, int Employee4Id, int licenseNo, int voterId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.Employee4Id = Employee4Id;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    // Getters
    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public int getEmployee4Id() {
        return Employee4Id;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public int getLicenseNo() {
        return licenseNo;
    }

    public String getPanCardNo() {
        return panCardNo;
    }
}

class Student {
    private String name;
    private long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;

    public Student(String name, long phoneNo, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
    }

    public Student(String name, long phoneNo, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Student(String name, long phoneNo, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    // Getters
    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public int getLicenseNo() {
        return licenseNo;
    }

    public String getPanCardNo() {
        return panCardNo;
    }
}

class D05P01 {
    public static void main(String[] args) {
        Employee4 Employee4 = new Employee4("Arun", 9123456780L, 1101, "LA78833DG");

        Register<Employee4> Employee4Register = new Register<>("Employee4");
        Employee4Register.display(Employee4);

        Student student = new Student("Joseph", 9123412780L, 2210, "SJLD1717K");

        Register<Student> studentRegister = new Register<>("Student");
        studentRegister.display(student);
    }
}
