package week4;
interface Interface1 {
 void method1();
}

abstract class AbstractClass {
 abstract void method2();
}

class MyClass extends AbstractClass implements Interface1 {
 public void method1() {
     System.out.println("Method 1 implementation from Interface1");
 }

 void method2() {
     System.out.println("Method 2 implementation from AbstractClass");
 }
}

public class Example2 {
 public static void main(String[] args) {
     MyClass obj = new MyClass();
     
     obj.method1();  // Outputs: Method 1 implementation from Interface1
     
     // Call method2() from AbstractClass
     obj.method2();  // Outputs: Method 2 implement
}
}