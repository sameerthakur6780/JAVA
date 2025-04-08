package com.Week8;

import java.util.ArrayList;
import java.util.Scanner;
class Student2 implements Cloneable{
  private String studID;
  private ArrayList<String> courses = new ArrayList<String>();
  public Student2(){
    studID = "000";  
    courses.add("Mathematics");
    courses.add("Elective 1");
    courses.add("Elective 2"); 
  }
  public void setStudID(String ID){
    studID = ID;
  }
  public void setElective1(String elective){
      courses.set(1,elective);
  }
  public void setElective2(String elective){
      courses.set(2,elective);
  }  
  public Object clone() throws CloneNotSupportedException{
    Student2 s = (Student2) super.clone();
    ArrayList<String> newcrs = new ArrayList<String>();
    for (String str: this.courses)
      newcrs.add(str);
    s.courses = newcrs;
    return s;
  }
  public String toString(){
    return studID+": "+courses;
  }
}
public class TestTest{
  public static void main(String[] args){    
    Scanner sc = new Scanner(System.in);
    Student2 dummyStudent2 = new Student2();     
    try{
      Student2 s1 = (Student2)dummyStudent2.clone();      
      s1.setStudID(sc.next());
      s1.setElective1(sc.next());
      s1.setElective2(sc.nextLine());

      Student2 s2 = (Student2)s1.clone();
      s2.setStudID(sc.next());
      s2.setElective2(sc.nextLine());

      System.out.println(s1+"\n"+s2);
    }
    catch(CloneNotSupportedException e){      
    }    
    sc.close();
  }
}