package com.learning.core.day10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class D10P03 {

    public static void main(String[] args) 
    {
        String textContent = readTextFromFile("C:\\Users\\anjal\\OneDrive\\Desktop\\Phase 0\\javacore\\src\\com\\learning\\core\\day10\\DavidScience.txt");

        if (textContent != null) 
        {
            serializeTextContent(textContent, "C:\\Users\\anjal\\OneDrive\\Desktop\\Phase 0\\javacore\\src\\com\\learning\\core\\day10\\serial.ser");

            String deserializedTextContent = deserializeTextContent("C:\\Users\\anjal\\OneDrive\\Desktop\\Phase 0\\javacore\\src\\com\\learning\\core\\day10\\serial.ser");

            if (deserializedTextContent != null) 
            {
                System.out.println("Deserialized text content:");
                System.out.println(deserializedTextContent);
            } 
            else 
            {
                System.out.println("Failed to deserialize text content.");
            }
        } 
        else 
        {
            System.out.println("Failed to read text from file.");
        }
    }

    public static String readTextFromFile(String filename) 
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) 
        {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) 
            {
                content.append(line).append("\n");
            }
            return content.toString();
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading text from file: " + e.getMessage());
            return null;
        }
    }

    public static void serializeTextContent(String textContent, String filename) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename))) 
        {
            objectOutputStream.writeObject(textContent);
            System.out.println("Text content serialized successfully.");
        } catch (IOException e) 
        {
            System.out.println("Error serializing text content: " + e.getMessage());
        }
    }

    public static String deserializeTextContent(String filename) 
    {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) 
        {
            return (String) objectInputStream.readObject();
        } 
        catch (ClassNotFoundException | IOException e) 
        {
            System.out.println("Error deserializing text content: " + e.getMessage());
            return null;
        }
    }
}
