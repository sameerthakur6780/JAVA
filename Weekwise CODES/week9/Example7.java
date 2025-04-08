package week9;

import java.io.*;
//write into a file
public class Example7 {
    public static void main(String[] args) {
        String outputFilePath = "E:\\Files\\output.txt"; //no file named output.txt

        try {
            
            FileOutputStream output = new FileOutputStream(outputFilePath,true); //append()
            int data = 65;
            output.write(data);
            // Close the FileOutputStream
            output.close();

            System.out.println("Data written to the file: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
