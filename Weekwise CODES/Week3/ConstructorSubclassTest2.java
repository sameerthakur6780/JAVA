package Week3;
//Example showing implicit call to default constructor of parent class by java compiler.
class Employee3 {
    private String name;
    private int Employee3ID;
    private double salary;

    // Default Constructor
    public Employee3() {
        this.name = "Unknown";
        this.Employee3ID = 0;
        this.salary = 0.0;
        System.out.println("Employee3 default constructor called.");
    }
    public void getName() {
    	System.out.println(name);
    }
    // Parameterized Constructor
    public Employee3(String name, int Employee3ID, double salary) {
        this.name = name;
        this.Employee3ID = Employee3ID;
        this.salary = salary;
        System.out.println("Employee3 parameterized constructor called with name: " + name + ", ID: " + Employee3ID + ", salary: " + salary);
    }

    public void work() {
        System.out.println(name + " is working...");
    }
}

class Manager3 extends Employee3 {
    private String department;
    private double bonus;

    // Constructor
    public Manager3(String department, double bonus) {
    	
        this.department = department;
        this.bonus = bonus;
        System.out.println("Manager3 constructor called with department: " + department + ", bonus: " + bonus);
    }
    

    public void conductMeeting() {
        System.out.println("Manager3 is conducting a meeting...");
    }
}

public class ConstructorSubclassTest2 {
    public static void main(String[] args) {
        Manager3 m = new Manager3("Sales", 5000); 
        m.getName();
    }
}


