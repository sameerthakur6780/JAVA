package Week3;
//No constructor defined in parent class 
class Vehicle1 {
  private String model;
  private int year;
  //default constructor
//No constructor defined in parent class 
  public void getModel(){
      System.out.println("Model : " + this.model);
  }

  public void getYear(){
      System.out.println("Year : " + this.year);
  }
}

class Car2 extends Vehicle1 {
  private int numDoors;
  private String fuelType;
   //No constructors explicitly defined
  //default constructor
  //construtor  -> default constructor
  public void getDoor(){
      System.out.println("Doors : " + this.numDoors);
  }
  public void getFuel(){
      System.out.println("Fuel Type : " + this.fuelType);
  }
}

public class ConstructorSubclassTest4{
  public static void main(String[] args){
      Car2 c = new Car2();
      c.getModel();   //null
      c.getYear();    //0
      c.getDoor();    //0
      c.getFuel();    //null
  }
}

