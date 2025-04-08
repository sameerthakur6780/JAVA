package week9;

import java.io.*;

class Employee implements Serializable {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "name: " + name +"," +" salary: "+salary;
    }
}

public class Example9 {
    public static void main(String[] args) {
        String filePath = "E://Files//Employeeser.txt";

        // Serialization
        Employee emp = new Employee("Arun", 50000.0);
        Employee emp2 = new Employee("Varun", 78000.0);

        //write into a file
        try {
        	FileOutputStream fos = new FileOutputStream(filePath);
        	ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.writeObject(emp2);
            System.out.println("Employee object serialized and saved to " + filePath);
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // Deserialization
        //reading
        try  {
        	FileInputStream fis = new FileInputStream(filePath);
        	ObjectInputStream ois = new ObjectInputStream(fis);
            Employee deserializedEmp = (Employee) ois.readObject();
            Employee deserializedEmp2 = (Employee) ois.readObject();

            System.out.println("Employee object deserialized:\n" + deserializedEmp);
            System.out.println("Employee object deserialized:\n" + deserializedEmp2);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}

