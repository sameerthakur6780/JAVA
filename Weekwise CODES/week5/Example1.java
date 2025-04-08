package week5;
//Generic Class
import java.lang.reflect.*;
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
class Example1{
	//Cannot overload as type erasure will make the signatures of these methods identical
//	public void printBox(Box<String> box) {  
//        System.out.println(box.getValue());
//    }
//
//    public void printBox(Box<Integer> box) {
//        System.out.println(box.getValue());
//    }
//
//    public void printBox(Box<Double> box) {
//        System.out.println(box.getValue());
//    }
	public static void main(String args[]) {
		Box<Integer> obj1 = new Box(5);
		System.out.println(obj1.getValue());
		
		Box<Double> obj2 = new Box(10.0);
		System.out.println(obj2.getValue());
		
		Box<String> obj3 = new Box("Hello");
		System.out.println(obj3.getValue());
		
		System.out.println(obj1.getClass());
		
		
	}
}
