package week9;

import java.io.*;

public class Example6 {
    public static void main(String[] args) {
        //read from a file
        try {
            FileInputStream f = new FileInputStream("E:\\Files\\input.txt");
            DataInputStream d = new DataInputStream(f);
            //System.out.println(d.available());
            if (d.available()> 0) {
                //byte[] data = new byte[f.available()]; //return number of bytes
                char data = d.readChar();
            	
               // System.out.println(data);
                //String content = new String(data);
                System.out.println("File content:\n" + data);
            } else {
                System.out.println("No data available in the file.");
            }
            
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: ");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
