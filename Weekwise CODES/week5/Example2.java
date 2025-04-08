package week5; 
// using object
public class Example2 {
	public static Object[] reverse(Object[] x)
	{
		Object tempobj;
		int n = x.length;
		for(int i = 0; i < n/2; i++) {
			tempobj = x[i];
			x[i] = x[(n-1-i)];
			x[(n-1-i)] = tempobj;
		}
		return x;
	}
	public static void main(String args[]) {
		Object[] x = {1,2.0,3,4.0,5};  //homogenity is also lost
		Object[] y = reverse(x);   //{5,4.0,3,2.0,1}
		Object[] s = {"a","b","c",1,2};
		Object[] r = reverse(s); 
		System.out.println(r[2]);
		
//		int result = y[4];     //type information is lost
//		System.out.println(result);
		
	}
}
