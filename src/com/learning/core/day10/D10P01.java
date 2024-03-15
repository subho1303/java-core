package com.learning.core.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class D10P01 
{

	public static void main(String[] args) 
	{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try 
        {
            System.out.print("Enter source file path: ");
            String sourceFile = reader.readLine();

            System.out.print("Enter destination file path: ");
            String destinationFile = reader.readLine();

            copyFile(sourceFile, destinationFile);
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }

    public static void copyFile(String sourceFile, String destinationFile) 
    {
        File source = new File(sourceFile);
        if (!source.exists()) 
        {
            System.out.println("Source file does not exist.");
            return;
        }

        File destination1 = new File(destinationFile);
        if (destination1.exists()) 
        {
            try 
            {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Destination file already exists. Do you want to overwrite? (Yes/No): ");
                String overwriteChoice = reader.readLine().toLowerCase();
                if (!overwriteChoice.equals("yes")) 
                {
                    System.out.println("Operation aborted.");
                    return;
                }
            } 
            catch (IOException e) 
            {
                System.out.println("An error occurred while reading user input: " + e.getMessage());
                return;
            }
        }

        try (FileInputStream inputStream = new FileInputStream(source);
             FileOutputStream outputStream = new FileOutputStream(destination1)) 
        {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) 
            {
                outputStream.write(buffer, 0, length);
            }

            System.out.println("File copied successfully.");

        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}