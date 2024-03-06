// ===========================================================================================================================================================================
// STATIC & PUBLIC 
// Java programs have either static or public attributes and methods.
// Static methods  can be accessed without creating an object of the class, 
// public methods can only be accessed by objects:
// ===========================================================================================================================================================================



// public class _4b_Class_Methods {
//         // Static method
//     static void myStaticMethod() {
//         System.out.println("Static methods can be called without creating objects");
//     }
//     // Create a fullThrottle() method
//     public void fullThrottle() {
//         System.out.println("The car is going as fast as it can!");
//     }

//     // Create a speed() method and add a parameter
//     public void speed(int maxSpeed) {
//         System.out.println("Max speed is: " + maxSpeed);
//     }

//     public static void main(String[] args) {
        
//         // Call the static method
//         myStaticMethod();

//         _4b_Class_Methods myCar = new _4b_Class_Methods();   // Create a myCar object
//         myCar.fullThrottle();      // Call the fullThrottle() method
//         myCar.speed(200);          // Call the speed() method

//     }//main()
// }//_4b_Class_Methods

// ===========================================================================================================================================================================
// CONSTRUCTORS 
//  A constructor in Java is a special type of method that is used to initialize objects of a class. It is called/invoked automatically when an object of a class is created. 
// Its primary purpose is to initialize the object's state by assigning values to its member variables (also known as fields).
//  It has the same name as the class and does not have a return type. 
// Constructors are called automatically when an object of the class is created. 
// They are primarily used to set initial values for the object's attributes or to perform any setup tasks needed for the object.
// They can have arguments to allow for custom initialization during object creation
// These are methods with the same name as the class. They have no return type (not even void).  the constructor name must match the class name, and it cannot have a return type (like void)
// All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.
// Constructors cannot be inherited by subclasses (unlike methods), but they can be overloaded (multiple constructors with different argument lists). see example.
// ===========================================================================================================================================================================



// public class _4b_Class_Methods {
//     int x;  // Create a class attribute

//       // Create a class constructor for the Main class
//     public _4b_Class_Methods() {
//         x = 9;  // Set the initial value for the class attribute x
//     }

//     public _4b_Class_Methods(int y) {
//         x = y;
//       }


// public static void main(String[] args) {
    

//     _4b_Class_Methods myObj = new _4b_Class_Methods(); // Create an object of class Main (This will call the constructor)
//     _4b_Class_Methods myObj2 = new  _4b_Class_Methods(5);
//     System.out.println(myObj.x); // Print the value of x
//     System.out.println(myObj2.x); // Print the value of x

// }//main()
// }//_4b_Class_Methods

// --------------------------------------------
// // // Imagine creating a BankAccount class. You might want member variables to store the account number, account holder name, and balance. 
// // // The constructor could take these details as arguments during object creation, ensuring proper initialization:

// public class _4b_Class_Methods {
//     private int accountNumber;
//     private String accountHolderName;
//     private double balance;


//     public _4b_Class_Methods() {
//         this.accountNumber = 234568;
//         this.accountHolderName = "New User";
//         this.balance = 0.00;
//       }

//     public _4b_Class_Methods(int accountNumber, String accountHolderName, double balance) {
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         this.balance = balance;
//       }
    
//       // Methods for depositing, withdrawing, etc. (not shown for brevity)

// public static void main(String[] args) {
    

//     // Creating  _4b_Class_Methods objects with specific details:
//     _4b_Class_Methods account0 = new  _4b_Class_Methods();
//     _4b_Class_Methods account1 = new  _4b_Class_Methods(123456, "John Doe", 1000.00);
//     _4b_Class_Methods account2 = new  _4b_Class_Methods(987654, "Jane Smith", 500.00);
//     System.err.println();
    
//     System.out.printf("Account Numbe: %d %nAccount Name: %s %nAccount Balance: %.1f %n",account0.accountNumber,account0.accountHolderName,account0.balance); // Print the value of x
//     System.err.println();

//     System.out.printf("Account Numbe: %d %nAccount Name: %s %nAccount Balance: %.1f %n",account1.accountNumber,account1.accountHolderName,account1.balance); // Print the value of x
//     System.err.println();

//     System.out.printf("Account Numbe: %d %nAccount Name: %s %nAccount Balance: %.1f %n",account2.accountNumber,account2.accountHolderName,account2.balance); // Print the value of x
//     System.err.println();
   

// }//main()

// }

// ===========================================================================================================================================================================
// Access Modifiers -- you can use either public or default:

// For classes, you can use either public or default. While the public class is accessible by any other class, The default class is only accessible by classes in the same package. This is used when you don't specify a modifier. 
// public --	The code is accessible for all classes
// private --	The code is only accessible within the declared class
// default --The code is only accessible in the same package. 
// protected	-- The code is accessible in the same package and subclasses. 

// Non-Access Modifiers --  you can use either final or abstract
// final --	The class cannot be inherited by other classes
// abstract --	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.)
// final	-- Attributes and methods cannot be overridden/modified
// static	-- Attributes and methods belongs to the class, rather than an object
// abstract	-- Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). 
// ===========================================================================================================================================================================
////// A static method means that it can be accessed without creating an object of the class, unlike public:
// public class _4b_Class_Methods {
//   // Static method
//   static void myStaticMethod() {
//     System.out.println("Static methods can be called without creating objects");
//   }

//   // Public method
//   public void myPublicMethod() {
//     System.out.println("Public methods must be called by creating objects");
//   }

//   // Main method
//   public static void main(String[ ] args) {
//     myStaticMethod(); // Call the static method
//     // myPublicMethod(); This would output an error

//     _4b_Class_Methods myObj = new _4b_Class_Methods(); // Create an object of Main
//     myObj.myPublicMethod(); // Call the public method
//   }
// }
// -------------------------
// ABSTRACT EXAMPLE
// ------------------------
// Code from filename: _4b_Class_Methods_Main_Main.java
// abstract class


// Main class for execution
class _4b_Class_Methods {
  public static void main(String[] args) {
    // create an object of the _4b_Class_Methods_MainXCV, class (which inherits attributes and methods from Main)
    _4b_Class_Methods_Main myObj = new _4b_Class_Methods_Main();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}




//===========================================================================================================================================================================
//===========================================================================================================================================================================
// 
// 
// 
//  
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
//===========================================================================================================================================================================
// 
// 
// 
//  
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



// ===========================================================================================================================================================================
// 
// 
//  
// 
// ===========================================================================================================================================================================


// ===========================================================================================================================================================================
// 
// 
//  
// 
// ===========================================================================================================================================================================




// ===========================================================================================================================================================================
// 
// 
//  
// 
// ===========================================================================================================================================================================


// ===========================================================================================================================================================================
// 
// 
//  
// 
// ===========================================================================================================================================================================



// ===========================================================================================================================================================================
// 
// 
//  
// 
// ===========================================================================================================================================================================



// ===========================================================================================================================================================================
// 
// 
//  
// 
// ===========================================================================================================================================================================




// ===========================================================================================================================================================================
// 
// 
//  
// 
// ===========================================================================================================================================================================


// ===========================================================================================================================================================================
// 
// 
//  
// 
// ===========================================================================================================================================================================



// ===========================================================================================================================================================================
// 
// 
//  
// 
// ===========================================================================================================================================================================
