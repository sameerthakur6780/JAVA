package week5;
//generic method
public class Example3 {
	public static <T> T[] reverse(T[] x)   //extends 
	{
		T tempobj;
		int n = x.length;
		for(int i = 0; i < n/2; i++) {
			tempobj = x[i];
			x[i] = x[(n-1-i)];
			x[(n-1-i)] = tempobj;
		}
		return x;
	}
	public static void main(String args[]) {
	Integer[] x = {1,2,3,4,5};  //int,double   Wrapper classes
	Integer[] y = reverse(x);   //{5,4,3,2,1}
	int result = y[4];  //type info 
	System.out.println(result);
	String[] s = {"java" , "python"};
    String[] sr = reverse(s);
	String s1 = sr[1];
    System.out.println(s1);
	//int,float,double primitive types 
    //generic methods  only objects   Double,Integer
}
}

