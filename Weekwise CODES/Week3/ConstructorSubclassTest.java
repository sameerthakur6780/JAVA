package Week3;

//Example showing explicit call to parent class constructor using super()
class Employee2 {
    private String name;
    private int Employee2ID;
    private double salary;

    // Constructor
    public Employee2(String name, int Employee2ID, double salary) {
        this.name = name;
        this.Employee2ID = Employee2ID;
        this.salary = salary;
        System.out.println("Employee2 constructor called with name: " + name + ", ID: " + Employee2ID + ", salary: " + salary);
    }

    
    public void work() {
        System.out.println(name + " is working...");
    }
}

class Manager2 extends Employee2 {
    private String department;
    private double bonus;

    // Constructor
    public Manager2(String name, int Employee2ID, double salary, String department, double bonus) {
        super(name, Employee2ID, salary); 
        this.department = department;
        this.bonus = bonus;
        System.out.println("Manager2 constructor called with department: " + department + ", bonus: " + bonus);
    }

    
    public void conductMeeting() {
        System.out.println("Manager2 is conducting a meeting...");
    }
}

public class ConstructorSubclassTest {
    public static void main(String[] args) {
        Manager2 m = new Manager2("John Doe", 12345, 75000, "Sales", 5000);
        m.work(); 
        m.conductMeeting(); 
    }
}
