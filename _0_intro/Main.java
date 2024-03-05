// public class Mai_4b_Class_Methods_Main {
        public String fname = "John";
        public int age = 24;
        public abstract void study(); // abstract method
      }
      
      // Subclass (inherit from Main)
      class Student extends _4b_Class_Methods_Main

// ===========================================================================================================================================================================
// You can force someone to enter a number in Java by repeatedly prompting them until they enter a valid number. You can achieve this using a loop along with input validation. 
// ===========================================================================================================================================================================

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int number = 0;
//         boolean validInput = false;

//         // Loop until valid input is provided
//         while (!validInput) {
//             System.out.print("Please enter a number: ");
//             if (scanner.hasNextInt()) {
//                 // If the input is an integer, assign it to the number variable
//                 number = scanner.nextInt();
//                 validInput = true; // Set validInput to true to exit the loop
//             } else {
//                 // If the input is not an integer, clear the scanner's buffer
//                 scanner.nextLine();
//                 System.out.println("Invalid input. Please enter a valid number.");
//             }
//         }

//         System.out.println("You entered: " + number);
//     }
// }

// // // We create a Scanner object to read input from the user.
// // // We initialize a boolean variable validInput to false to indicate that the input is initially invalid.
// // // We use a while loop that continues until validInput becomes true, meaning the user has entered a valid number.
// // // Inside the loop, we prompt the user to enter a number.
// // // We use the hasNextInt() method to check if the next token entered by the user is an integer.
// // // If the input is an integer, we use nextInt() to read the integer value and assign it to the number variable.
// // // If the input is not an integer, we clear the scanner's buffer by calling nextLine() to consume the invalid input and display an error message.
// // // Once a valid number is entered, the loop exits, and we print the entered number.

//////// ------

// // // Let's break down this part of the code to clarify its functionality:

// // // while (!validDOB) { ... }: This is a while loop that continues to execute until validDOB becomes true. Initially, validDOB is false, so the loop will run at least once.

// // // System.out.print("Enter date of birth (year): ");: This line prompts the user to enter their date of birth, specifically the year.

// // // if (scanner.hasNextInt()) { ... }: This if statement checks if the next input provided by the user is an integer using the hasNextInt() method of the Scanner class.

// // // dob = scanner.nextInt(); validDOB = true;: If the input is an integer, it is read using scanner.nextInt() and assigned to the dob variable, which represents the date of birth. Then, validDOB is set to true, indicating that a valid input has been provided, and the loop will terminate.

// // // else { ... }: If the input is not an integer (i.e., if hasNextInt() returns false), the code inside the else block is executed.

// // // System.out.println("Invalid input. Please enter a valid year.");: This line informs the user that their input is invalid and prompts them to enter a valid year.

// // // scanner.nextLine();: This statement clears the input buffer by consuming the entire line of invalid input. This is necessary because after calling nextInt(), the cursor stays at the end of the line, and if you don't consume the newline character, it will be read as the input for the next nextLine() call, leading to unexpected behavior.

// // // -----
// // // The purpose of the while loop in this context is to ensure that the user enters a valid year for their date of birth. Let's break down the loop step by step:

// // // Initialization:

// // // Initially, validDOB is set to false. This variable tracks whether the user has entered a valid year or not.
// // // Loop Condition:

// // // The loop condition is while (!validDOB). This means the loop will continue executing as long as validDOB is false, indicating that the user has not entered a valid year yet.
// // // Prompting the User:

// // // Inside the loop, the program prompts the user to enter their date of birth, specifically the year, with the message "Enter date of birth (year): ".
// // // Input Validation:

// // // The program checks if the next input provided by the user is an integer using scanner.hasNextInt().
// // // If the input is indeed an integer, it is read using scanner.nextInt(), and assigned to the variable dob which represents the date of birth year.
// // // Then, validDOB is set to true, indicating that the user has entered a valid year.
// // // Handling Invalid Input:

// // // If the input is not an integer (i.e., hasNextInt() returns false), the program enters the else block.
// // // It prints an error message, informing the user that their input is invalid and prompting them to enter a valid year.
// // // Additionally, it consumes the invalid input line using scanner.nextLine() to clear the input buffer. This ensures that the next nextInt() call doesn't read the same invalid input again.
// // // Loop Continuation/Exit:

// // // After handling the input, the loop repeats if validDOB is still false (i.e., the user has not entered a valid year).
// // // Once the user provides a valid year and it is assigned to dob, validDOB becomes true, and the loop exits.

// // // ----
// // // In Java, the ! symbol represents the logical negation operator. When it precedes a boolean expression, it negates the value of that expression. Here, !validDOB means "not validDOB".

// // // So, while (!validDOB) translates to "while validDOB is false".

// // // This might seem contradictory, as we're checking for the loop to continue as long as validDOB is false. However, it's a common practice to use a negated condition like this in situations where it's more logical to express the loop condition in terms of when it should continue.

// // // In this specific scenario, validDOB starts as false, indicating that the date of birth input has not been validated yet. The loop continues as long as validDOB is false, prompting the user to input their date of birth until a valid input is provided, at which point validDOB becomes true, and the loop terminates.

// // // So, in summary, while (!validDOB) means "while the date of birth is not valid yet", and the loop continues until a valid date of birth is entered.

// // // -----
// // // Let's clarify the meanings of while(validDOB) and while(!validDOB) given that validDOB is initially false:

// // // while(validDOB): This loop will not execute initially because the condition validDOB evaluates to false. In Java, a while loop executes as long as the condition evaluates to true. Since validDOB is false initially, the loop condition is false, and the loop body will not be executed at all.

// // // while(!validDOB): This loop will execute initially because the condition !validDOB evaluates to true. The ! operator negates the value of validDOB, so !validDOB evaluates to true. In Java, a while loop executes as long as the condition evaluates to true, so the loop body will be executed repeatedly until validDOB becomes true.

// // // In summary:

// // // while(validDOB) will not execute initially and will skip the loop body.
// // // while(!validDOB) will execute initially and will continue executing the loop body until validDOB becomes true.

// ===========================================================================================================================================================================

// ===========================================================================================================================================================================
public class Main {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}

// ===========================================================================================================================================================================

// ===========================================================================================================================================================================