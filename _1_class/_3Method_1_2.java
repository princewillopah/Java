import java.util.Scanner;  // Import the Scanner class

public class _3Method_1_2 {

  //Static Method
  static void myMethod() {
    System.out.println("I just got executed!");
  }
  //Static Method with parameter
  static void myMethod2(String fname, int age) {
    System.out.println(fname + " Thomas");
  }

  //cal age
  static int  dob(int x) {
    return 2024 - x;
  }

  static double salary_evaluate(int real_age, double salary) {
    if(real_age > 0){
       if(real_age > 18){
         return 0.8 * salary;
       }else{
        return 0.4 * salary;
       }
    }
    return 0;
  }

  static void final_evaluation(String name, int age, int realAge, double evaluate){

    if(realAge == age){
     
      System.out.printf("Hello %s, congratulations. you have the sum of %.2f as your salary grant for th age %d.  %n",name,evaluate,realAge);

    }else{
      System.out.printf("Hello %s, you do not qualify. you gave a false age.  %n",name);
    }

  }

  static void evaluate_grant(String name, int age, int dob, double salary){
       int realAge = dob(dob);
       double salary_evaluate = salary_evaluate(realAge,salary);


       final_evaluation(name,age,realAge,salary_evaluate);

  }




    public static void main(String[] args) {
        _2Method_2 myObj = new _2Method_2();
        _1Method_1 myObj2 = new _1Method_1();
        
        System.out.println("Hey "+myObj2.name+" the valu is "+myObj.x);
        myMethod();
        myMethod();

        myMethod2("Liam",5);
        myMethod2("Jenny",7);
        myMethod2("Anja",9);

        Scanner input_Obj= new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter name:");
        // String input
        String name = input_Obj.nextLine();

        System.out.println("Enter age: ");
        // Numerical input
        int age = input_Obj.nextInt();

        System.out.println("Enter year of birth:");
        int dob = input_Obj.nextInt();

        System.out.println("Enter salary:");
        double capital_grant  = input_Obj.nextDouble();


        //function to call
        evaluate_grant(name,age,dob,capital_grant);


      }
}
