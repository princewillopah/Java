package _7_interface;

public class Single_interface {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        var cat = new Cat();
        myPig.animalSound();
        myPig.sleep();
        myPig.run();

        cat.animalSound();
        cat.sleep();
        cat.run();
        cat.react();
      }  
}
