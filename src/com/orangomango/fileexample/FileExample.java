package com.orangomango.fileexample;

import java.io.*;

public class FileExample{

  public static void main(String[] args) throws IOException{
     File f = new File("test.txt");
     f.createNewFile();
     
     try(BufferedWriter writer = new BufferedWriter(new FileWriter(f))){
       String[] lines = new String[]{"This is a test file\n", "second line"};
       
       for (String line : lines){
         writer.write(line);
       }
       
       System.out.println("Lines written to file successfully");
     }
     
     try (BufferedReader reader = new BufferedReader(new FileReader(f))){
       String line;
       int x = 1;
       
       System.out.println("\nLINES:");
       while ((line = reader.readLine()) != null) {
         System.out.println("Line "+x+": "+line);
         x++;
       }
     }
  }

}
