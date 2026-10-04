import java.util.*;

class Shape {
    void displayShape() {
        System.out.println("This is a Shape");
    }
}

class Rectangle extends Shape {
    int length = 10;
    int breadth = 5;

    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

class Circle extends Shape {
    double radius = 7;

    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

public class q2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        r.displayShape();
        r.area();

        c.displayShape();
        c.area();
    }
}