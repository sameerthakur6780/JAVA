package week5;
import java.lang.reflect.*;
class Storage  {
    private int number;  //fields
    public String text;  //fields

    public Storage() {};
    public Storage(int number) {
    	this.number = number;
    }
    public Storage(int number, String text) {
        this.number = number;
        this.text = text;
    }
    public String toString() {
    	return number + " " + text;
    }
    public void method1(int i) {
    	System.out.println("Displaying i:"+ i);
    }
    public void method2(int param) {}
    public static void staticMethod() {}
    private void privateMethod() {}
}
public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Create an instance of Storage
        Storage obj = new Storage(3,"Hello");
        // Get the class of obj
        Class objClass = obj.getClass();
        System.out.println(objClass);   //Storage
        
        // Create a new object of the same type as obj
        Object newObj = objClass.getDeclaredConstructor().newInstance();
        
        System.out.println(newObj);
        // Get the constructors of Storage
        Constructor[] constructors = objClass.getConstructors();
        System.out.println("Constructors:");
        for(Constructor c1 : constructors) {
        	System.out.println(c1);
        }
        System.out.println("Parameter types of constructors:");
        
        for (int i = 0; i < constructors.length; i++){
        	Class params[] = constructors[i].getParameterTypes();
        	for (int j = 0; j < params.length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(params[j].getName());
            }
        	System.out.println();
        }
        
        
        // Get all methods of Storage
        Method[] methods = objClass.getMethods();
        System.out.println("Methods:");

        for (Method method : methods) {
            System.out.println(method);
        }
        
        Field[] fields1 = objClass.getFields();
        System.out.println("Public Fields:");
        for (Field field : fields1) {
            System.out.println(field);
        }
        
        // Get all fields of Storage
        Field[] fields = objClass.getDeclaredFields();
        System.out.println(" DEclared Fields:");
        for (Field field : fields) {
            System.out.println(field);
        }
        // Before setting the value'
        System.out.println(obj);
        // Set the value of a field
        String value = "Hi";
        int newnum = 10;
        fields[0].setAccessible(true);
        fields[0].set(obj,newnum);
        fields[1].set(obj, value); // Set the value
        System.out.println(obj);
        // Get all declared methods of Storage
        Method[] declaredMethods = objClass.getDeclaredMethods();
        System.out.println("Declared methods:");
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        // Get all declared constructors of Storage
        Constructor[] declaredConstructors = objClass.getDeclaredConstructors();
        System.out.println("Declared constructors:");
        for (Constructor c : declaredConstructors) {
            System.out.println(c);
        }
        // Get all declared fields of Storage
        Field[] declaredFields = objClass.getDeclaredFields();
        System.out.println("Declared fields:");
        for (Field field : declaredFields) {
            System.out.println(field.getName());
        }
    }
}