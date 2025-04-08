package Week3;

class Employee{
	  private String name;
	  private double salary;
	  public Employee( String name, double salary){
	    this.name = name;
	    this.salary = salary;
	  }
	  public double bonus(double salary){  //to calculate bonus of employee
	    return salary*0.1;
	  }
	  public String getName() {
	     return name;
	  }
	  public void setName(String name) {
	     this.name = name;
	  }
	  public double getSalary() {
	     return salary;
	  }
	  public void setSalary(double salary) {
	     this.salary = salary;
	 }
	}
class Manager extends Employee {
	  private String secretary;
	  public Manager(String name,double salary,String secretary){
	    super(name,salary);
	    this.secretary = secretary;
	  }
	  public double bonus(double salary){
	    return salary*0.2;//to calculate bonus of manager(redefining method of parent class:overriding)
	  }

	    public String getSecretary() {
	        return secretary;
	    }

	    public void setSecretary(String secretary) {
	        this.secretary = secretary;
	    }
	  
	}

public class DynamicDispatch {
	  public static void main(final String[] args) {
	    //Employee e = new Employee("John",100000);
	    //System.out.println(e.bonus(100000));
	    //Manager m = new Manager("Jane", 150000, "Alice");
	    //System.out.println(m.bonus(100000));
	    
	    //dynamic dispatch
	    Employee e2 = new Manager("Bob",100000,"Alice");
	    System.out.println(e2.bonus(100000));

	    
	    
	   //notpossibelline e2.setSecretary("Alice")
	   // Manager m1=(Manager)e2;//type casting
	   // m1.setSecretary("Alice");
	   // System.out.println("Name: " + m1.getName() + " Salary: " + m1.getSalary() + " Secretary: " + m1.getSecretary());
	   // System.out.println(e2.bonus(100000));
	    
	  }
	}