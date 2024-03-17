package _5_Abstraction;//_10b_Abstract_Class_main_Class is the  Main class to demonstrate abstract classes and methods



//  Shape_Abstract_Class is Abstract class representing a shape
abstract class Shape_Abstract_Class {
    // Abstract methods for calculating area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Rectangle_SubClass is a Concrete subclass representing a rectangle
class Rectangle_SubClass extends Shape_Abstract_Class {

    private double width;
    private double height;

    // Constructor
    public Rectangle_SubClass(double width, double height) {
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


//  Circle_SubClass  is a Concrete subclass representing a circle
class Circle_SubClass extends Shape_Abstract_Class {
    private double radius;

    // Constructor
    public Circle_SubClass(double radius) {
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

public class Main_Class {
    public static void main(String[] args) {
        // Creating objects of Rectangle and Circle
        Rectangle_SubClass rectangle = new Rectangle_SubClass(5, 3);
        Circle_SubClass circle = new Circle_SubClass(4);

        // Calculating and printing area and perimeter of shapes
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}
