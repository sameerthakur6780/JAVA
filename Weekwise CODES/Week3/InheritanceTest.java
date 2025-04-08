package Week3;
class Employee {
	  private String name;
	  private double salary;

	  public Employee(String n, double s) {
	    this.name = n;
	    this.salary = s;
	  }

	  public void setName(String n) {
	    this.name = n;
	  }

	  public void setSalary(double s) {
	    this.salary = s;
	  }

	  public String getName() {
	    return this.name;
	  }

	  public double getSalary() {
	    return this.salary;
	  }

	  public double bonus(float percent){
	    return(percent/100.0)*salary;
	  }
	}

	class Manager extends Employee {
	  private String secretary;

	  public Manager(String n, double s, String sec) {
	    super(n, s);
	    this.secretary = sec;
	  }

	  public void setSecretary(String sec) {
	    this.secretary = sec;
	  }

	  public String getSecretary() {
	    return this.secretary;
	  }

	  public double bonus(float percent) {
	    double b = super.bonus(percent);
	    ;
	    return (1.5 * b);
	  }
	}
public class InheritanceTest {

}
