package Week3;

class Animals {
	String name;
	int age;
public Animals(String name, int age){
	this.name = name;
	this.age = age;
}
// Overriding toString method
public String toString(){
	return "name=" + name + ", age=" + age;
}
}
public class TestToString {
 public static void main(String[] args) {
     Animals animal = new Animals("Tom", 5);
     System.out.println(animal);
 }
}
