package com.learning.core.day10;

import java.io.*;
import java.util.Scanner;

class BlankFieldException extends Exception
{
    public BlankFieldException(String message) 
    {
        super(message);
    }
}


class Student implements Serializable 
{
    private int rollNumber;
    private String name;
    private int age;
    private String address;

    public Student(int rollNumber, String name, int age, String address) 
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }




    @Override
    public String toString() 
    {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}

public class D10P02
{
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            while (true) 
            {
                try 
                {
                    Student student = acceptStudentData(scanner);
                    if (student != null) 
                    {
                        System.out.print("Do you want to write the data to a file? (Yes/No): ");
                        String choice = scanner.nextLine().toLowerCase();
                        if (choice.equals("yes")) 
                        {
                            writeToFile(student);
                        } else 
                        {
                            System.out.println("Program terminated.");
                            break;
                        }
                    }
                } 
                catch (BlankFieldException e) 
                {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static Student acceptStudentData(Scanner scanner) throws BlankFieldException {
        System.out.print("Enter Roll Number: ");
        int rollNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) 
        {
            throw new BlankFieldException("Name cannot be blank.");
        }

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Address: ");
        String address = scanner.nextLine().trim();
        if (address.isEmpty()) 
        {
            throw new BlankFieldException("Address cannot be blank.");
        }

        return new Student(rollNumber, name, age, address);
    }

    private static void writeToFile(Student student) throws IOException 
    {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student_data.ser", true))) 
        {
            outputStream.writeObject(student);
            System.out.println("Data written to file successfully.");
        }
    }
}
