package com.learning.core.day4;

import java.util.Scanner;

class CatheyBankException extends Exception 
{
 public CatheyBankException(String message) 
 {
     super(message);
 }
}

class InvalidNameException extends CatheyBankException 
{
 public InvalidNameException(String message) 
 {
     super(message);
 }
}

class InvalidPostException extends CatheyBankException 
{
 public InvalidPostException(String message) 
 {
     super(message);
 }
}

class InvalidAgeException extends CatheyBankException 
{
 public InvalidAgeException(String message) 
 {
     super(message);
 }
}

class Validator 
{
 public void validate(Applicant applicant) throws CatheyBankException 
 {
     if (!isValidApplicantName(applicant.applicantName)) 
     {
         throw new InvalidNameException("Invalid Applicant Name");
     }
     if (!isValidPost(applicant.postApplied)) 
     {
         throw new InvalidPostException("Invalid Post");
     }
     if (!isValidAge(applicant.applicantAge)) 
     {
         throw new InvalidAgeException("Invalid Age");
     }
     System.out.println("All details are valid");
 }

 public boolean isValidApplicantName(String name) 
 {
     return name != null && !name.isEmpty();
 }

 public boolean isValidPost(String post) 
 {
     return post != null && (post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer"));
 }

 public boolean isValidAge(int age) 
 {
     return age > 20 && age < 30;
 }
}

class Applicant 
{
 String applicantName;
 String postApplied;
 int applicantAge;

 public Applicant(String applicantName, String postApplied, int applicantAge) 
 {
     this.applicantName = applicantName;
     this.postApplied = postApplied;
     this.applicantAge = applicantAge;
 }
}

public class D04P03 {
    public static void main(String[] args) 
    {
        Validator validator = new Validator();
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter applicant name, post applied, and age separated by spaces:");
        String userInput = scanner.nextLine();
        String[] inputParts = userInput.split(" ");

        if (inputParts.length != 3)
        {
            System.out.println("Invalid input format");
            return;
        }

        String applicantName = inputParts[0];
        String postApplied = inputParts[1];
        int applicantAge = Integer.parseInt(inputParts[2]);

        try 
        {
            validator.validate(new Applicant(applicantName, postApplied, applicantAge));
        } 
        catch (CatheyBankException e) 
        {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}