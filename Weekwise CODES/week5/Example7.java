package week5;
import java.util.*;
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}
class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
public class Example7 {
    public static void drawShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Rectangle());
        drawShapes(shapes);
    }
}
   