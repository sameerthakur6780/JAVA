package week5;
//bounded
public class Example4 {
	public static <T extends Number> T[] reverse(T[] x)//bound
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
	Integer[] x = {1,2,3,4,5};
	Integer[] y = reverse(x);   //{5.0,4,3.0,2,1}
	//int result = y[4];  //type info
	//System.out.println(result);
	String[] s = {"java" , "python"};
	String[] sr = reverse(s);
	String s1 = sr[1];
	System.out.println(s1);

}
}

