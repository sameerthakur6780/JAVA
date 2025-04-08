package Week3;
class Address {
 private String street;
 private String city;
 private String state;
 public Address(String street, String city, String state) {
     this.street = street;
     this.city = city;
     this.state = state;
    
 }
 public String getStreet() {
     return street;
 }

 public void setStreet(String street) {
     this.street = street;
 }

 public String getCity() {
     return city;
 }

 public void setCity(String city) {
     this.city = city;
 }

 public String getState() {
     return state;
 }

 public void setState(String state) {
     this.state = state;
 }

}

class Person {
 private String name;
 private Address address; // Aggregation

 public Person(String name, Address address) {
     this.name = name;
     this.address = address;
 }
 
 
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public Address getAddress() {
     return address;
 }

 public void setAddress(Address address) {
     this.address = address;
 }

 
}

public class Aggregation {
 public static void main(String[] args) {
     Address address = new Address("123 Main St", "Anytown", "India");
     Person person = new Person("Ram", address);

     // Accessing person's address
     System.out.println("Name: " + person.getName());
     System.out.println("Address: " + person.getAddress().getStreet() + ", " +
                        person.getAddress().getCity() + ", " +
                        person.getAddress().getState()
                        );
 }
}

