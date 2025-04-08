package Week3;

class Shape{
	  public double area(int a){
	    return a*a;
	  }
	  public int area(int l,int b){    //METHOD OVERLOADING
	    return l*b;
	  }
	  public double area(double r){
	    return 3.14*r*r;
	  }
	}
	public class Overloading{
	  public static void main(String[] args){
	    Shape s = new Shape();
	    //System.out.println(s);    //toString method
	    System.out.println(s.area(5));
	    System.out.println(s.area(7,2));
	    System.out.println(s.area(10.0));
	  }
	  
	}

