package _5_Abstraction.shapes;


// Main class to demonstrate abstract classes and methods
public class Main {
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


