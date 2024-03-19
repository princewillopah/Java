//Java Anonymous Class
//An anonymous class in Java is an inner class which is declared without any class name at all.
// In other words, a nameless inner class in Java is called an anonymous inner class.
//Since it does not have a name, it cannot have a constructor because we know that a constructor name is the same as the class name.
//syntax
//new(argument-list){
//// Anonymous class body
// }
package _9_Others;

interface Truck {
    public void develop();
}

abstract class Engine {
    public abstract void engineType();
}
class Vehicle {
    public void transport(Engine e) {
        e.engineType();
    }
}
class Car{
    public void engineType() {
        System.out.println("Turbo Engine -- From a concrete class");
    }
}

public class _3_Anonymous_Class {
    public static void main(String args[]) {
        Car c1 = new Car();
        c1.engineType();

        //////////////// normal Anonymous Class  ////////////////
        Car c2 = new Car() {
            @Override
            public void engineType() {
                System.out.println("V2 Engine -- From Anonymous inner class ");
            }
        };
        c2.engineType();
        //////////////// Anonymous inner class that implements an interface  ////////////////
        Truck s = new Truck() {
            @Override
            public void develop() {
                System.out.println("Range Rover Sport -- From Anonymous class that implements an interface(Truck)");
            }
        };
        s.develop();
        //////////////// Anonymous inner class as an argument ////////////////

        Vehicle v = new Vehicle();
        v.transport(new Engine() {
            @Override
            public void engineType() {
                System.out.println("Turbo Engine");
            }
        });

    }
}
