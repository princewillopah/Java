//===========================================================================================================================================================================
//===========================================================================================================================================================================
// Java Polymorphism
// Polymorphism is the ability of an object to take on many forms
// Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance
//  While Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
//  
// 
// 
// 
// 
// 
// 
// 

//===========================================================================================================================================================================
//===========================================================================================================================================================================
// For example below, think of a superclass called Animal that has a method called animalSound(). 
// Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):
// class Animal {
//     public void animalSound() {
//       System.out.println("The animal makes a sound");
//     }
//   }
//   @Override // Explicitly indicate method overriding --Although , this is optional 
//   class Pig extends Animal {
//     public void animalSound() {
//       System.out.println("The pig says: wee wee");
//     }
//   }
//   @Override // Explicitly indicate method overriding
//   class Dog extends Animal {
//     public void animalSound() {
//       System.out.println("The dog says: bow wow");
//     }
//   }

// public class _6a_Polymorphism {
    
//     public static void main(String[] args) {
//         Animal myAnimal = new Animal();  // Create a Animal object
//         Animal myPig = new Pig();  // Create a Pig object
//         Animal myDog = new Dog();  // Create a Dog object
//         myAnimal.animalSound();
//         myPig.animalSound();
//         myDog.animalSound();
//       }


// }

//-------------------------------------------------------------------------------------------
//  Shape Calculations examples 
//-------------------------------------------------------------------------------------------
// public interface Shape { // Interface defines a contract for shapes
//     double calculateArea();
// }

// public class Circle implements Shape {

//     private double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     public double calculateArea() {
//         return Math.PI * radius * radius;
//     }
// }

// public class Rectangle implements Shape {

//     private double length;
//     private double width;

//     public Rectangle(double length, double width) {
//         this.length = length;
//         this.width = width;
//     }

//     @Override
//     public double calculateArea() {
//         return length * width;
//     }
// }

// public class _6a_Polymorphism {

//     public static void calculateArea(Shape shape) { // Polymorphic parameter: Accepts any Shape object
//         System.out.println("Area: " + shape.calculateArea());
//     }

//     public static void main(String[] args) {
//         Circle circle = new Circle(5);
//         Rectangle rectangle = new Rectangle(4, 6);

//         calculateArea(circle); // Outputs: Area: 78.53981633974483
//         calculateArea(rectangle); // Outputs: Area: 24.0
//     }
// }


interface Vegetarian{}
class Animal{}
public class Deer extends Animal implements Vegetarian{
	public static void main(String[] args) {
		Deer d = new Deer();
		Animal a = d;
		Vegetarian v = d;
		Object o = d;
		
		System.out.println(d instanceof Deer);
		System.out.println(a instanceof Deer);
		System.out.println(v instanceof Deer);
		System.out.println(o instanceof Deer);
	}	
}



