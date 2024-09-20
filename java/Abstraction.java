// Abstraction Example
abstract class Shape {
    // Abstract method (does not have a body)
    public abstract double area();

    // Concrete method
    public void display() {
        System.out.println("The area is: " + area());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.display();
    }
}