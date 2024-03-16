// Implementation of Run Time Polymorphism with Virtual Methods
package _6_Polymorphism.Run_Time_Polymorphism2;

public class Main {
    public static void main(String [] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00); // Dynamic Binding  // Employee(Parent) reference but Salary(child) object
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }

}
