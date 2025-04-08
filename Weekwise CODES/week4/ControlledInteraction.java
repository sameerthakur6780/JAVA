package week4;

interface Academics{
   public abstract void getResult();
}
class University{
     private int univ_id = 077;
     
     private class College implements Academics{
          private String college_name;
          private int college_code;
          College(String name,int code){
              college_name = name;
              college_code = code;
          }
          public void getName(){
              System.out.println(college_name);
          }
          public void getResult(){
        	  System.out.println("100% passed");
          }

  }
  public Academics getReference(){
        return new College("IITMadras",1001);
  }
}
public class ControlledInteraction{
     public static void main(String[] args) {
           University uni = new University();
           //University.College obj = uni.new College();
           Academics acad = uni.getReference();
           //acad.getName();
           acad.getResult();
     }
}