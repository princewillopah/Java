package _7_Interface;
  
  // Pig "implements" the Animal interface
  class Pig implements Animal {
    public void animalSound() {
      // The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
    }
    public void sleep() {
      // The body of sleep() is provided here
      System.out.println("Zzz");
    }
    public void run() {
        // The body of sleep() is provided here
        System.out.println("zoooooom!");
      }

  }

public class _1_Single_interface {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
        myPig.run();
      }  
}
