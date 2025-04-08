package Week3;

class Calculator {
 public int add(int a, int b) {
     return a + b;
 }
}

class MathOperations {
 private Calculator calculator; 
 public MathOperations(Calculator calculator) {
     this.calculator = calculator;
 }

 public int performAddition(int x, int y) {
     return calculator.add(x, y); 
 }
}
public class Dependency {
 public static void main(String[] args) {
     Calculator calculator = new Calculator(); 
     MathOperations mathOps = new MathOperations(calculator); 

     int result = mathOps.performAddition(5, 3); 
     System.out.println("Addition result: " + result); 
 }
}

