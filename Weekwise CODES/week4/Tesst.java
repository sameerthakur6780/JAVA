package week4;
abstract class Shape5{
	public void f() {
		System.out.println("Hello World");
	}
}
interface T{
	void f();
}
public class Tesst extends Shape5 implements T {
	public void f() {
		super.f();
		System.out.println("Hello ");
	}
	public static void main(String[] args) {
		Tesst t = new Tesst();
		t.f();
	}
}
