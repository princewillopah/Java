//_10b_Abstract_Class_main_Class is the  Main class to demonstrate abstract classes and methods

public class _10b_Abstract_Class_main_Class {
    public static void main(String[] args) {
        // Creating objects of Rectangle and Circle
        _10b_Abstract_Class_Rectangle_SubClass rectangle = new _10b_Abstract_Class_Rectangle_SubClass(5, 3);
        _10b_Abstract_Class_Circle_SubClass circle = new _10b_Abstract_Class_Circle_SubClass(4);

        // Calculating and printing area and perimeter of shapes
        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}
