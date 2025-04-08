package com.Week8;

import java.util.*;
import java.util.stream.*;
class Faculty{
String name;
double salary;
//Constructor to initialize instance variables
Faculty(String n,double s){
	name = n;
	salary = s;
}
//Method toString() to return name of the faculty
public String toString() {
	return name;
}
}
public class Test {
public static void main(String[] args){
var fArr = new ArrayList<Faculty>();
fArr.add(new Faculty("Sravya",30000.00));
fArr.add(new Faculty("Thanvi",50000.00));
fArr.add(new Faculty("Sharadha",100000.00));
fArr.add(new Faculty("Pooja",29000.00));
Map<Boolean, List<Faculty>> facMap;
facMap = fArr.stream().collect(Collectors.partitioningBy(f->f.salary >= 50000.00));

System.out.println(facMap.get(false));
}
}
