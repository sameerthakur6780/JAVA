package week4;
interface Shape1{
//can have abstract methods, 
//	default methods, static methods, 
//	and public and static and final variables
    //by default methods in interface are public and abstract
	 int i = 9;
	 void draw(); //abstract and public
	 default void paint() {  //
		 System.out.println("painting");
	 }//
	 static void f() {
		 System.out.println("f");   //public, no modifier , protected,private
	 }
}
class Circle1 implements Shape1{
    public void draw() {
		System.out.println("drawing circle");
	}
    public void paint() {
    	System.out.println("painting circle");
    	
    }
}
public class Example4 {
public static void main(String[] args) {
	Shape1 s1 = new Circle1();
	s1.draw();
	s1.paint();
	Shape1.f();
}
}
