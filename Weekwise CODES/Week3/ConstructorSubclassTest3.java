package Week3;
//No constructor defined in parent class 
class Vehicle {
    private String model;  //null
    private int year;       // 0

    // No constructors explicitly defined

    public void getModel(){
        System.out.println("Model : " + this.model);
    }

    public void getYear(){
        System.out.println("Year : " + this.year);
    }
}

class Car extends Vehicle {
    private int numDoors;
    private String fuelType;

    // Constructor without explicit call to super()
    public Car(int numDoors, String fuelType) {
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }
    public void getDoor(){
        System.out.println("Doors : " + this.numDoors);
    }
    public void getFuel(){
        System.out.println("Fuel Type : " + this.fuelType);
    }
}

public class ConstructorSubclassTest3{
    public static void main(String[] args){
        Car c = new Car(4, "Petrol");
        c.getDoor();
        c.getFuel();
        c.getModel();
        c.getYear();
    }
}

