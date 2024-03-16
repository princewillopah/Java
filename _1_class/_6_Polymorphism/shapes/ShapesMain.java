package _6_Polymorphism.shapes;

public class ShapesMain {
    public static void calculateArea(Shape shape) { // Polymorphic parameter: Accepts any Shape object
         System.out.println("Area: " + shape.calculateArea());
     }

     public static void main(String[] args) {
         Circle circle = new Circle(5);
         Rectangle rectangle = new Rectangle(4, 6);

         calculateArea(circle); // Outputs: Area: 78.53981633974483
         calculateArea(rectangle); // Outputs: Area: 24.0
     }
}
