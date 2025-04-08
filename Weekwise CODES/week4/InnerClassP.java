package week4;
class Emplyee{
	String name;
	Address a;
	public Emplyee(String name) {
		this.name = name;
		
	}
	private class Address{
		private String city;
		public Address(String city) {
			this.city = city;
	    }
		public String toString() {
			return city;
		}
    }
	public void addandsetAddress(String c) {
		a = new Address(c);
		//a.city = "bglr";
	}
	public String toString() {
		return "name:" + name + ", address:" + a;
	}
}

class InnerClassP{
	public static void main(String[] args) {
		Emplyee e = new Emplyee("Meena");
		e.addandsetAddress("Chennai");
		System.out.println(e);
		
	}
}