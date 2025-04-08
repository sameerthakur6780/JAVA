package week5;
import java.lang.reflect.*;
public class ReflectionExample2 {
public static boolean classequal(Object o1, Object o2) {
	System.out.println(o1.getClass());
	System.out.println(o2.getClass().getName());
    return (o1.getClass()==o2.getClass());
}
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        Integer int1 = 5;
        System.out.println(classequal(str1, str2)); // Output: true (Both are instances of String class)
        System.out.println(classequal(str1, int1)); // Output: false (String and Integer are different classes)
        
    }
}

