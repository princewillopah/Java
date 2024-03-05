// import java.util.Scanner;

// public class _3methods {
    

//   //cal age
//   static int  dob(int x) {
//     return 2024 - x;
//   } // dob

//   static double salary_evaluate(int real_age, double salary) {
//     if(real_age > 0){
//        if(real_age > 18){
//          return 0.8 * salary;
//        }else{
//         return 0.4 * salary;
//        }
//     }
//     return 0;
//   } // end salary_evaluate

//   static void final_evaluation(String name, int age, int realAge, double evaluate){

//     if(realAge == age){
     
//       System.out.printf("Hello %s, congratulations. you have the sum of %.2f as your salary grant for th age %d.  %n",name,evaluate,realAge);

//     }else{
//       System.out.printf("Hello %s, you do not qualify. you gave a false age.  %n",name);
//     }

//   }// final_evaluation

//   static void evaluate_grant(String name, int age, int dob, double salary){
//        int realAge = dob(dob);
//        double salary_evaluate = salary_evaluate(realAge,salary);


//        final_evaluation(name,age,realAge,salary_evaluate);

//   }//evaluate_grant


// //=======================================================

//     public static void main(String[] args) {

        
//         Scanner input_Obj= new Scanner(System.in);  // Create a Scanner object

//         System.out.println("Enter name:");
//         // String input
//         String name = input_Obj.nextLine();

//         System.out.println("Enter age: ");
//         // Numerical input
//         int age = input_Obj.nextInt();

//         System.out.println("Enter year of birth:");
//         int dob = input_Obj.nextInt();

//         System.out.println("Enter salary:");
//         double capital_grant  = input_Obj.nextDouble();

//         //function to call
//         evaluate_grant(name,age,dob,capital_grant);

//         // Close the Scanner object to prevent resource leak
//          input_Obj.close();



//       }//end main()


// }

// ===========================================================================================================================================================================
// You can force someone to enter a number in Java by repeatedly prompting them until they enter a valid number. You can achieve this using a loop along with input validation. 
// ===========================================================================================================================================================================



// import java.util.Scanner;

// public class _3methods {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter name
//         System.out.print("Enter name: ");
//         String name = scanner.nextLine();

//         // Prompt the user to enter date of birth
//         int dob = 0;
//         boolean validDOB = false;
//         while (!validDOB) {
//             System.out.print("Enter date of birth (year): ");
//             if (scanner.hasNextInt()) {
//                 dob = scanner.nextInt();
//                 validDOB = true;
//             } else {
//                 System.out.println("Invalid input. Please enter a valid year.");
//                 scanner.nextLine(); // Clear the input buffer
//             }
//         }

//         // Prompt the user to enter salary
//         double salary = 0;
//         boolean validSalary = false;
//         while (!validSalary) {
//             System.out.print("Enter salary: ");
//             if (scanner.hasNextDouble()) {
//                 salary = scanner.nextDouble();
//                 validSalary = true;
//             } else {
//                 System.out.println("Invalid input. Please enter a valid salary.");
//                 scanner.nextLine(); // Clear the input buffer
//             }
//         }

//         // Prompt the user to enter years of experience
//         int yearsOfExperience = 0;
//         boolean validExperience = false;
//         while (!validExperience) {
//             System.out.print("Enter years of experience: ");
//             if (scanner.hasNextInt()) {
//                 yearsOfExperience = scanner.nextInt();
//                 validExperience = true;
//             } else {
//                 System.out.println("Invalid input. Please enter a valid number of years.");
//                 scanner.nextLine(); // Clear the input buffer
//             }
//         }

//         // Calculate gratuity
//         double gratuity = calculateGratuity(salary, yearsOfExperience);

//         // Display results
//         System.out.println("Name: " + name);
//         System.out.println("Date of Birth: " + dob);
//         System.out.println("Salary: $" + salary);
//         System.out.println("Years of Experience: " + yearsOfExperience);
//         System.out.println("Gratuity: $" + gratuity);

//         // Close the Scanner object
//         scanner.close();
//     }

//     // Method to calculate gratuity
//     public static double calculateGratuity(double salary, int yearsOfExperience) {
//         return salary * yearsOfExperience * 0.1; // Adjust the gratuity calculation formula as needed
//     }
// }


// ===========================================================================================================================================================================
// You can force someone to enter a number in Java by repeatedly prompting them until they enter a valid number. You can achieve this using a loop along with input validation. 
// ===========================================================================================================================================================================



// import java.util.Scanner;

// public class _3methods {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Get date of birth
//         int dateOfBirth = 0;
//         while (true) {
//             System.out.print("Enter your date of birth (as a number): ");
//             try {
//                 dateOfBirth = Integer.parseInt(scanner.nextLine());
//                 break;  // Exit the loop if input is valid
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid input. Please enter a number.");
//             }
//         }

//         // Get salary
//         double salary = 0;
//         while (true) {
//             System.out.print("Enter your salary: ");
//             try {
//                 salary = Double.parseDouble(scanner.nextLine());
//                 break;  // Exit the loop if input is valid
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid input. Please enter a number.");
//             }
//         }

//         // Get years of experience
//         int yearsOfExperience = 0;
//         while (true) {
//             System.out.print("Enter your years of experience: ");
//             try {
//                 yearsOfExperience = Integer.parseInt(scanner.nextLine());
//                 break;  // Exit the loop if input is valid
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid input. Please enter a number.");
//             }
//         }

//         // Now you can use the validated values for further processing
//         System.out.println("Date of birth: " + dateOfBirth);
//         System.out.println("Salary: " + salary);
//         System.out.println("Years of experience: " + yearsOfExperience);

//         // Close the Scanner object
//         scanner.close();
//     }
// }

// // // Explanation:

// // // Import Scanner: This line imports the Scanner class, allowing you to read user input from the console.

// // // Create Scanner Object: The Scanner scanner = new Scanner(System.in); line creates a Scanner object to read input.

// // // Loop for Input Validation: The code uses while (true) loops to repeatedly prompt for input until a valid number is entered.

// // // Prompt for Input: Inside each loop, the code prints a message asking for a specific value (date of birth, salary, or years of experience).

// // // Try-Catch for Handling Errors: The try-catch block attempts to convert the user's input into the desired numerical format (int or double). If the input is not a number, a NumberFormatException is thrown, and the catch block handles it by displaying an error message and continuing the loop.

// // // Exit Loop if Valid: If the conversion is successful (meaning the input is a number), the break statement exits the loop.

// // // Use Validated Values: After all inputs are successfully validated, the code prints them to the console to demonstrate that you now have numerical values for further work.

// // // Key Points:

// // // The Integer.parseInt and Double.parseDouble methods are used to convert user input into integers and doubles, respectively.
// // // The while (true) loop ensures that the user is prompted until a valid number is entered.
// // // The try-catch block is used to handle potential errors and prevent program crashes.



// ===========================================================================================================================================================================
// You can force someone to enter a number in Java by repeatedly prompting them until they enter a valid number. You can achieve this using a loop along with input validation. 
// ===========================================================================================================================================================================



// import java.util.Scanner;

// public class _3methods {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Get date of birth
//         int dateOfBirth = getPositiveInteger(scanner, "Enter your date of birth (as a number): ");

//         // Get salary
//         double salary = getPositiveDouble(scanner, "Enter your salary: ");

//         // Get years of experience
//         int yearsOfExperience = getPositiveInteger(scanner, "Enter your years of experience: ");

//         // Now you can use the validated values for further processing
//         System.out.println("Date of birth: " + dateOfBirth);
//         System.out.println("Salary: " + salary);
//         System.out.println("Years of experience: " + yearsOfExperience);
//     }

//     public static int getPositiveInteger(Scanner scanner, String message) {
//         int input;
//         do {
//             System.out.print(message);
//             try {
//                 input = Integer.parseInt(scanner.nextLine());
//                 if (input <= 0) {
//                     System.out.println("Invalid input. Please enter a positive number.");
//                 }
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid input. Please enter a number.");
//                 input = 0; // Initialize to avoid infinite loop
//             }
//         } while (input <= 0);

//         return input;
//     }

//     public static double getPositiveDouble(Scanner scanner, String message) {
//         double input;
//         do {
//             System.out.print(message);
//             try {
//                 input = Double.parseDouble(scanner.nextLine());
//                 if (input <= 0) {
//                     System.out.println("Invalid input. Please enter a positive number.");
//                 }
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid input. Please enter a number.");
//                 input = 0.0; // Initialize to avoid infinite loop
//             }
//         } while (input <= 0);

//         return input;
//     }
// }

// // // Explanation:

// // // Import and Scanner Object: Similar to the previous example.

// // // Separate Validation Functions: This code introduces two functions, getPositiveInteger and getPositiveDouble, which handle user input prompts, conversion, and validation for integers and doubles, respectively.

// // // do-while Loop: Instead of while (true), these functions use do-while loops. They ensure the prompt is displayed at least once, even if the first input is invalid.

// // // Validation within the Loop: The loop continues as long as the input (input) is less than or equal to 0 (not positive).

// // // Error Handling: The try-catch block remains similar, handling conversion errors and displaying appropriate messages.

// // // Positive Number Check: Within the loop, an additional check ensures the input is not only a number but also a positive value. If not, an error message is displayed.

// // // Returning Valid Values: After successful validation, the function returns the converted (and validated) number.

// // // Main Function: The main function remains similar, calling these functions to get the validated values and utilizing them later.

// // // This approach provides a more modular and reusable way to handle user input validation while ensuring positive numbers are entered.