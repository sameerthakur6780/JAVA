package week4;
abstract class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    abstract void makeSound();
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says meow");
    }
}
public class Example3 {
    public static void main(String[] args) {
        Animal obj = new Cat("Luna");
        obj.makeSound(); 
        obj.sleep();     
    }
}


