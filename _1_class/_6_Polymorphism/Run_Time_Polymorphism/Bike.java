package _6_Polymorphism.Run_Time_Polymorphism;

class Bike extends Vehicle {
    // Method overriding
    @Override
    public void displayInfo() {
        System.out.println("I have a Bike.");
    }
}