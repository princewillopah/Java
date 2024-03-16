//Java Dynamic Binding: Using the super Keyword
//When invoking a superclass version of an overridden method the super keyword is used so that we can utilize parent class method while using dynamic binding.

//In this example, we've created two classes Animal and Dog where Dog class extends Animal class. Dog class overrides the move method of its super class Animal.
//But it calls parent move() method using super keyword so that both move methods are called when child method is called due to dynamic binding.
//In main() method, we're using Animal class reference and assign it an object of Dog class to check Dynamic binding effect.

package _6_Polymorphism.Run_Time_Polymorphism2;
class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    public void move() {
        super.move();   // invokes the super class method
        System.out.println("Dogs can walk and run");
    }
}

public class Super_Keyword_Dynamic_Binding {
    public static void main(String args[]) {
        Animal b = new Dog();   // Animal reference but Dog object
        b.move();   // runs the method in Dog class
    }
}
