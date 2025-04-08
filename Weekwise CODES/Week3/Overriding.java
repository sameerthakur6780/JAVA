package Week3;

class Employeee{
	  private String name;
	  private double salary;
	  public Employeee( String name, double salary){
	    this.name = name;
	    this.salary = salary;
	  }
	  public double bonus(double salary){  //to calculate bonus of Employeee
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

class Managerr extends Employeee {//Managerr class is the child class or subclass of Employeee class
	  private String secretary;
	  public Managerr(String name,double salary,String 
	  secretary){
	    super(name,salary);//invoke the constructor of parent class(Employeee class)
	    this.secretary = secretary;
	  }
	  public double bonus(double salary){
	    return salary*0.2;//to calculate bonus of Managerr(redefining method of parent class:overriding)
	  }

	  public String getSecretary() {
	      return secretary;
	  }

	  public void setSecretary(String secretary) {
	      this.secretary = secretary;
	  }
}
public class Overriding {
	 public static void main(final String[] args) {
	    Employeee e = new Employeee("John",100000);    //An object of Employee is created and assigned to reference variable of type Employee  
	    Managerr m = new Managerr("Jane", 100000, "Alice");  //An object of Manager is created and assigned to reference variable of type Manager 
	    System.out.println(e.bonus(100000));
	    System.out.println(m.bonus(100000));
	    
	    // dynamic dispatch
	    Employeee e2 = new Managerr("Bob",100000,"Alice");     //An object of Manager is created and assigned to reference variable of type Employee 
        System.out.println(e2.bonus(100000));                   //The method bonus from manager class is invoked.
	    
	 }
}
