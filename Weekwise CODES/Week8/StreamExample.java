package com.Week8;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Stream;
import java.util.*;
import java.util.stream.Collectors;
//public class StreamExample {
//
//	public static void main(String[] args) {
//	
//		    
//		// TODO Auto-generated method stub
//		//1.Normal
//	//List<Integer> numbers = Arrays.asList(11,21,31,41,1,2,3,4,50);
////		int count = 0;
////		for(Integer i : numbers) {
////			if(i % 2==0) {
////				count++;
////			}
////		}
////		System.out.println(count);
//		
//	    //2.stream
////		long c = numbers.stream().filter(i -> i%2 == 0).count();
////		System.out.println(c);
//		
//	
//		//3.To print
//		//numbers.stream().filter(i -> i%2 == 0).forEach(i -> System.out.println(i));
//		
//		//4.map
//		//numbers.stream().filter(n -> n%2 == 0).map(n -> n*n).forEach(i -> System.out.println(i));
//		
//		//5.generate method
//		 
//		 //Stream<Double> randomnums = Stream.generate(Math::random);
//		 //randomnums.forEach(num -> System.out.println(num));
//		 
//		 //6.generate with limit
////		 Stream<Double> randomnums = Stream.generate(Math::random).limit(10);
////		 randomnums.forEach(num -> System.out.println(num));
//	     
//	     //7.iterate with skip()
//         //Stream.iterate(0, n -> n+1).skip(10).limit(20).forEach(num -> System.out.println(num));
//	     
//	     //8.iterate()
//	     // Stream.iterate(0, n -> n+1).limit(20).forEach(num -> System.out.println(num));
//	     
//	     
//	     //9.takewhile()
//	//List<Integer> numbers = Arrays.asList(11,21,31,41,1,2,3,4,50);
//	
//    //numbers.stream().takeWhile(n -> n > 10).forEach(n -> System.out.println(n));
//	
//		  //10.dropwhile()
//	      
////          Stream<Integer> drop = numbers.stream().dropWhile(n -> n > 10);
////	      drop.forEach(n -> System.out.println(n));
////		long c = Stream.iterate(0, n -> n <= 50, n -> n + 1)
////                .filter(n -> n % 3 == 0).count();
//		
////		long c = Stream.iterate(0, n -> n <= 50, n -> n + 1)
////                .filter(n -> n % 3 == 0).count();
////		long c = Stream.iterate(0, n -> n + 3)
////                .dropWhile(n -> n < 50).count();
////		long c = Stream.iterate(0, n -> n + 3)
////                .limit(50).count();
////		System.out.println(c);
//		
//		
//	}
//
//}
import java.util.*;
class Teacher{
String name;
double experience;
public Teacher(String name, double exp) {
this.name = name;
this.experience = exp;
}
}
public class StreamExample{
public static void main(String[] args) {
List<Teacher> tList = new ArrayList<Teacher>();
tList.add(new Teacher("T1", 3.5));
tList.add(new Teacher("T2", 4.2));
tList.add(new Teacher("T3", 2.6));
tList.add(new Teacher("T4", 3.4));
tList.add(new Teacher("T5", 1.5));
//CODE BLOCK
  tList.stream()
  .map(i -> i.experience >= 2 && i.experience <= 4)
  .forEach(l->System.out.println(l));
}
}
