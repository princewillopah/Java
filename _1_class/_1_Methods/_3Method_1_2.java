// import java.lang.reflect.Method;

// public class _3Method_1_2 {

//   //Static Method
//   static void myMethod() {
//     System.out.println("I just got executed!");
//   }
//   //Static Method with parameter
//   static void myMethod2(String fname, int age) {
//     System.out.println(fname + " Thomas");
//   }



//     public static void main(String[] args) {

//         _2Method_2 myObj = new _2Method_2();
//         _1Method_1 myObj2 = new _1Method_1();
        
//         System.out.println("Hey "+myObj2.name+" the valu is "+myObj.x);
//         myMethod();
//         myMethod();

//         myMethod2("Liam",5);
//         myMethod2("Jenny",7);
//         myMethod2("Anja",9);


//       }
// }


//===========================================================================================================================================================================
//===========================================================================================================================================================================
// Compile-time Polymorphism (Method Overloading)
// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// This occurs when multiple methods in the same class have the same name but different parameters.
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

public class _3Method_1_2  {
  // Method to add two integers
  public int add(int a, int b) {
      return a + b;
  }

  // Method to add three integers
  public int add(int a, int b, int c) {
      return a + b + c;
  }

  // Method to add two doubles
  public double add(double a, double b) {
      return a + b;
  }

  public static void main(String[] args) {
    _3Method_1_2  calc = new _3Method_1_2 ();
      
      // Method overloading - resolved at compile-time
      System.out.println("Sum of 2 + 3: " + calc.add(2, 3));
      System.out.println("Sum of 2 + 3 + 4: " + calc.add(2, 3, 4));
      System.out.println("Sum of 2.5 + 3.7: " + calc.add(2.5, 3.7));
  }
}