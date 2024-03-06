

//===========================================================================================================================================================================
//===========================================================================================================================================================================
// Encapsulation in Java
// Imagine building a house. You wouldn't leave the electrical wiring exposed or allow anyone to mess with the foundation directly. 
// Encapsulation in Java is similar. It's a way to protect the "inner workings" (data) of an object while providing controlled access through well-defined methods.
// 
// Key Concepts:
// (1) Classes: Classes are blueprints for creating objects. They define the properties (data) and functionalities (methods) of those objects.
// (2) Member Variables: These are the variables declared within a class to store data specific to each object. They can be private, protected, or public.
// (3) Methods: These are functions defined within a class to perform specific actions or calculations.
// 
// Java encapsulation is a fundamental concept in object-oriented programming that helps ensure data integrity and hide implementation details. 
// It involves bundling the data (attributes) and methods (behaviors) that operate on the data into a single unit, known as a class. 
// Encapsulation allows us to control access to the data by defining access modifiers and providing getter and setter methods.
// 
// The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. We know that private variables can only be accessed within the same class (an outside class has no access to it). 
// However, it is possible to access them if we provide public get and set methods.
// The get method returns the variable value, and the set method sets the value.
// To achieve this, you must:
// (1) declare class variables/attributes as private
// (2) provide public get and set methods to access and update the value of a private variable
//===========================================================================================================================================================================
import java.util.Scanner;

public class _5b_Encapsulation_BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor -- constructor with validation (optional) -- for initial values
    public _5b_Encapsulation_BankAccount(String accountNumber, String name, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = name;
        this.balance = initialBalance;

        // if (accountNumber > 0 && initialDeposit >= 0) { // Add validation checks
        //     this.accountNumber = accountNumber;
        //     this.accountHolderName = accountHolderName;
        //     this.balance = initialDeposit;
        // } else {
        //     throw new IllegalArgumentException("Invalid account number or initial deposit.");
        // }
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // setter methods to modify these attributes
    // Setter for account number
    // public void setAccountNumber(String accountNumber) {
    //     this.accountNumber = accountNumber;
    // }

    // // Setter for balance
    // public void setBalance(double balance) {
    //     this.balance = balance;
    // }


    // Method to perform deposit using Scanner
    public void depositWithScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        deposit(amount);
        // Close the Scanner object
        scanner.close();
    }

    // Method to perform withdrawal using Scanner
    public void withdrawWithScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        withdraw(amount);

        // Close the Scanner object
        scanner.close();
    }


    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
            System.out.println("Deposited: ₦" + amount + ". New balance: ₦" + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
            System.out.println("Withdrawn: ₦" + amount + ". New balance: ₦" + balance);
        } else if(amount < 0) {
            System.out.println("Invalid amount. Withdrawal failed.");
        } else if( balance < amount) {
            System.out.println("insufficient balance. Withdrawal failed.");
        }
    }

    // Main method to demonstrate encapsulation
    public static void main(String[] args) {
        // Create a new bank account
        _5b_Encapsulation_BankAccount account = new _5b_Encapsulation_BankAccount("123456789","John Doe", 1000.0);

        // Display account details
        System.out.println();
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Name: " + account.getAccountHolderName());
        System.out.println("Balance: ₦" + account.getBalance());
        System.out.println();

        // Perform transactions using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 for withdrawal or 2 for deposit: ");
        int option = scanner.nextInt();


        switch(option) {
            case 1:
                account.withdrawWithScanner();
                break;
            case 2:
                 account.depositWithScanner();
                break;
            default:
                // code block
        }



        // Display updated balance
        System.out.println("Updated Balance: ₦" + account.getBalance());


        
        // Update account details using setters
        // account.setAccountNumber("987654321");
        // account.setBalance(2000.0);

        // Display updated account details
  

        // Perform transactions
        // account.deposit(500.0);
        // account.withdraw(200.0);
        // account.withdraw(1500.0);

        // Close the Scanner object
        scanner.close();
    }



}


