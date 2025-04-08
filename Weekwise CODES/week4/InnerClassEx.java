package week4;
class Employee{
	String name;
	Address a;
	
	public Employee(String name) {
		this.name = name;
		
	}
    public class Address{   //inner class - class inside another class
		String city;
		public Address(String city) {
			this.city = city;
	    }
    }
}

class InnerClassEx{
	public static void main(String[] args) {
		Employee e = new Employee("Meena");  //e
		Employee.Address a1 = e.new Address("Chennai");
		
	}
}