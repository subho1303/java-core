package com.learning.core.day10;

import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class D10P06
 {
    public static void main(String[] args) {
        combineNotes("C:/Users/anjal/OneDrive/Desktop/Phase 0/javacore/src/com/learning/core/day10/DavidEnglish.txt", "C:/Users/anjal/OneDrive/Desktop/Phase 0/javacore/src/com/learning/core/day10/DavidScience.txt", "C:/Users/anjal/OneDrive/Desktop/Phase 0/javacore/src/com/learning/core/day10/DavidComputer.txt", "C:/Users/anjal/OneDrive/Desktop/Phase 0/javacore/src/com/learning/core/day10/DavidNotes.txt");
    }

    public static void combineNotes(String file1, String file2, String file3, String outputFile) 
   {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2));
             BufferedReader reader3 = new BufferedReader(new FileReader(file3));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) 
	{

            appendFileContents(reader1, writer);
            appendFileContents(reader2, writer);
            appendFileContents(reader3, writer);

            System.out.println("Notes combined successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void appendFileContents(BufferedReader reader, BufferedWriter writer) throws IOException 
   {
        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line + "\n");
        }
        writer.write("\n");
    }
}