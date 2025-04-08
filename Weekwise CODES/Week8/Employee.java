
package com.Week8;

		//1.normal copy

public class Employee {
	  private String name;
	  private double salary;
	  public Employee(String n, double s){
	    name = n;
	    salary = s;
	  }
	  public void setname(String n){
	    name = n;
	  }
	  public void setsalary(double s){
	    salary = s;
	  }
	  public String getname(){
	    return name;
	  }

	public static void main(String[] args) {
	    Employee e1 = new Employee("Jack", 21500.0);
	    Employee e2 = e1;
	    System.out.println(e1.getname());

	    e2.setname("John"); // e1 also updated
	   System.out.println(e1.getname());
	    System.out.println(e2.getname());

	  }
}
	
	
	//2.clone method from Object Class

public class Employee implements Cloneable {
	  private String name;
	  private double salary;
	  public Employee(String n, double s){
	    name = n;
	    salary = s;
	  }
	  public void setname(String n){
	    name = n;
	  }
	  public void setsalary(double s){
	    salary = s;
	  }
	  public String getname(){
	    return name;
	  }
	public static void main(String[] args) throws Exception {
	    Employee e1 = new Employee("Jack", 21500.0);
	    Employee e2 = (Employee)e1.clone();
	    e2.setname("John"); // e1 not affected
	    System.out.println(e1.getname());
	    System.out.println(e2.getname());

	  }
	}  


   //3.Including reference variable

class Date{
	private int date,month,year;

	public Date(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}
	public String toString() {
		return date + "/" + month + "/" + year;
	}
	public void update(int dd,int mm,int yy) {
		this.date = dd;
		this.month = mm;
		this.year = yy;
	}
	
}
public class Employee implements Cloneable{
	private String name;
	private double salary;
	private Date dob;
	public Employee(String n,double s,Date d) {
		name = n;
		salary = s;
		dob = d;
	}
	public void setname(String n){
		name = n;
	}
	public void setbday(int dd, int mm, int yy){
		this.dob.update(dd,mm,yy);
	}
	public String toString() {
		return name+ " "+salary+" "+dob;
	}
	public static void main(String[] args) throws Exception {
		Date d1 = new Date(14,11,2023);
	    Employee e1 = new Employee("Jack", 21500.0,d1);
	    Employee e2 = (Employee)e1.clone();
	    e2.setname("John"); 
	    e2.setbday(07, 07, 2023);
	    
	    System.out.println(e1);
	    System.out.println(e2);
	    

	  }
}
	
          //4.cloning date object

	class Date implements Cloneable{
		private int date,month,year;

		public Date(int date, int month, int year) {
			this.date = date;
			this.month = month;
			this.year = year;
		}
		public String toString() {
			return date + "/" + month + "/" + year;
		}
		public void update(int dd,int mm,int yy) {
			this.date = dd;
			this.month = mm;
			this.year = yy;
		}
		public Object clone() throws CloneNotSupportedException{
			return super.clone(); //create copy of date and return as object
		}
		
	}
	public class Employee implements Cloneable{
		private String name;
		private double salary;
		private Date dob;
		public Employee(String n,double s,Date d) {
			name = n;
			salary = s;
			dob = d;
		}
		public void setname(String n){
			name = n;
		}
		public void setbday(int dd, int mm, int yy){
			this.dob.update(dd,mm,yy);
		}
		public String toString() {
			return name + " "+ salary +" "+ dob;
		}
		public Object clone() throws CloneNotSupportedException{
			Employee newemp = (Employee) super.clone();
			Date newbday = (Date) dob.clone();
			newemp.dob = newbday;
			return newemp;
		}
		public static void main(String[] args) throws Exception {
			Date d1 = new Date(14,11,2023);
		    Employee e1 = new Employee("Jack", 21500.0,d1);
		    var e2 = (Employee)e1.clone();
		    e2.setname("John"); 
		    e2.setbday(07, 07, 2023);
		    
		    System.out.println(e1);
		    System.out.println(e2);
		    

		  }
	
}
//	  
//	  
//	  
	  
	  
	  
	  
	  
	  
	  

