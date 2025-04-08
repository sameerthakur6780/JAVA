package week9;

import java.io.*;
//coping from one file to another file
//open the input file and output file
//read from the input file
//write to output file
public class Example8 {
    public static void main(String[] args) {
        String inputFilePath = "E:\\Files\\input.txt"; // Path to the input file
        String outputFilePath = "E:\\Files\\outputfile.txt"; // Path to the output file
        
        try {
            FileInputStream input = new FileInputStream(inputFilePath);
            DataInputStream d = new DataInputStream(input);
            
            FileOutputStream output = new FileOutputStream(outputFilePath);
            DataOutputStream dataOutput = new DataOutputStream(output);
            
            if (d.available()> 0) {
                byte[] data = new byte[d.available()];
                input.read(data);
                //String content = new String(data);
                dataOutput.write(data);
                //System.out.println("File content:\n" + content);
            } else {
                System.out.println("No data available in the file.");
            }
            
            input.close();
            // Close input and output streams
            d.close();
            
            dataOutput.close();
            
            System.out.println("File copied successfully from '" + inputFilePath + "' to '" + outputFilePath + "'.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }
}
