// Abstract class representing a shape
abstract class Shape {
    // Abstract methods for calculating area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Concrete subclass representing a rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementation of abstract methods
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

// Concrete subclass representing a circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract methods
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class to demonstrate abstract classes and methods
public class _10a_Abstract_Class {
    public static void main(String[] args) {
        // Creating objects of Rectangle and Circle
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);

        // Calculating and printing area and perimeter of shapes
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}


