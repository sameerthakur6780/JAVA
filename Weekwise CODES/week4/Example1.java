package week4;
abstract class Shape{
	public abstract void draw(); //runtime
	
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing a Circle");
	}
	public void draw(int a) {  //overloading //compile time
		System.out.println(a);
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("Drawing a Square");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}
public class Example1 {
	//we cant create objects of abstract class
	public static void main(String[] args) {
	Shape c1 = new Circle();     //The reference variable s1 is of type Shape, the object is of type Circle
	c1.draw();
	
	((Circle)(c1)).draw(9);
	Circle c2 = new Circle();
	c2.draw(6);
}	
	
}
