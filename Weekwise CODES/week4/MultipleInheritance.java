package week4;
//public, no modifier,protected, private
interface Scanner{
	public abstract void scan();
	public default void f() {
		System.out.println("f from Scanner ");
	}
}
interface Printer{
	public abstract void print();
	public default void f() {
		System.out.println("f from Printer ");
	}
}
class Copier implements Scanner,Printer{
	public void scan() {
		System.out.println("Scanning");
	}
	public void print() {
		System.out.println("Printing");
	}
	public void f() {
		Scanner.super.f();
		Printer.super.f();
//		System.out.println("f from Copier");
	}
	
}
public class MultipleInheritance {
	public static void main(String[] args) {
    Copier c1 = new Copier();
    c1.scan();
    c1.print();
    c1.f();
}
}