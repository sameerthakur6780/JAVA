package com.Week12;
import java.util.Scanner;
public class CLITest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first num:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second num:");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the operation (add, subtract, multiply, divide):");
        String operation = scanner.next();
        double result = calculate(num1, operation, num2);
        System.out.println("Result: " + result);
        scanner.close();
    }
    private static double calculate(double num1, String operation, double num2) {
        double result = 0.0;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.exit(1); // Terminate the program
                }
                break;
            default:
                System.out.println("Error: Invalid operation");
                System.exit(1); // Terminate the program
        }

        return result;
    }
}

