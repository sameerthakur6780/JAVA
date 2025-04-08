package week5;
import java.util.*;
class WildCardEx {
	public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
public class Example6{
	public static void main(String[] args) {
		 List<Integer> intList = new ArrayList<>();
	        intList.add(1);
	        intList.add(2);
	        intList.add(3);
	        intList.add(4);
	        intList.add(5);
	        System.out.print("Integer list: ");
	        WildCardEx.printList(intList);
	        
	        List<String> stringList = new ArrayList<>();
	        stringList.add("a");
	        stringList.add("b");
	        stringList.add("c");
	        stringList.add("d");
	        stringList.add("e");
	        System.out.print("String list: ");
	        WildCardEx.printList(stringList);
	    }
}

