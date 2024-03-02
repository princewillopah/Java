import java.util.ArrayList;
import java.util.Arrays;

public class _0_test {

    // public static boolean isPrime(int num) {
    //         // Handle special cases:
    //         if (num <= 1) {
    //             return false; // Numbers less than or equal to 1 are not prime
    //         }

    //         // Check for divisibility up to the square root of the number:
    //         for (int i = 2; i * i <= num; i++) {
    //             if (num % i == 0) {
    //                 return false; // If the number is divisible, it's not prime
    //             }
    //         }

    //         return true; // If we didn't find any divisors, it's prime
    //     }

    //     public static void main(String[] args) {
    //         int number = 17;
    //         if (isPrime(number)) {
    //             System.out.println(number + " is a prime number");
    //         } else {
    //             System.out.println(number + " is not a prime number");
    //         }
    //     }

// -------------------------------------------------------------

// public static boolean isPrime(int num) {
//         // Handle special cases:
//         if (num <= 1) {
//             return false;
//         }

//         // Check for divisibility up to the square root:
//         for (int i = 2; i * i <= num; i++) {
//             if (num % i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         int[] numbers = {2, 7, 10, 13, 15, 17, 20};

//         System.out.print("Prime numbers in the array: ");
//         for (int num : numbers) {
//             if (isPrime(num)) {
//                 System.out.print(num + " ");
//             }
//         }
//           System.out.println();
//     }

// =================================================


//  public static boolean isPrime(int num) {


//             // Check if number is an even number :
        
//                 if (num % 2 == 0) {
//                     return true; // // this is an even number 
//                 }
            

//             return false; // this is not an even number 
//         }

//         public static void main(String[] args) {
//             int number = 16;
//             if (isPrime(number)) {
//                 System.out.println(number + " is an even  number");
//             } else {
//                 System.out.println(number + " is not an even number");
//             }
//         }


// --------------------------------------------?

    // public static boolean isPrime(int num) {
     
    //         // Check if number is an even number :
        
    //             if (num % 2 == 0) {
    //                 return true; // // this is an even number 
    //             }
            

    //         return false; // this is not an even number 
    // }

    // //public static void


    // public static void main(String[] args) {
    //     int[] numbers = {2, 7, 10, 13, 15, 17, 20};

    //     System.out.print("Prime numbers in the array: ");
    //     for (int num : numbers) {
    //         if (isPrime(num)) {
    //             System.out.print(num + " ");
    //         }
    //     }
    //       System.out.println();
    // }





    // --------------------------------------------------





    // public static boolean isPrime(int num) {
    //     if (num <= 1) {
    //         return false;
    //     }
    //     for (int i = 2; i * i <= num; i++) {
    //         if (num % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void main(String[] args) {
    //     // Generate random array
    //     int[] arr = new int[20];
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = (int) (Math.random() * 100 + 1); // Generate random numbers between 1 and 100
    //     }

    //     // Separate even, odd, and prime numbers
    //     ArrayList<Integer> even = new ArrayList<>();
    //     ArrayList<Integer> odd = new ArrayList<>();
    //     ArrayList<Integer> prime = new ArrayList<>();
    //     for (int num : arr) {
    //         if (num % 2 == 0) {
    //             even.add(num);
    //         } else {
    //             odd.add(num);
    //             if (isPrime(num)) {
    //                 prime.add(num);
    //             }
    //         }
    //     }

    //     // Print original array
    //     System.out.println("Original array: " + Arrays.toString(arr));

    //     // Print even numbers array
    //     System.out.println("Even numbers: " + even);

    //     // Print odd numbers array
    //     System.out.println("Odd numbers: " + odd);

    //     // Print prime numbers array
    //     System.out.println("Prime numbers: " + prime);

    //     // Sort original array (ascending)
    //     Arrays.sort(arr);
    //     System.out.println("Sorted array (ascending): " + Arrays.toString(arr));

    //     // Sort original array (descending) - avoid modifying the original array
    //     int[] sortedDescending = Arrays.copyOf(arr, arr.length);
    //     Arrays.sort(sortedDescending);
    //     System.out.println("Sorted array (descending): " + Arrays.toString(sortedDescending));
    // }


    // -------------------------------------------

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        public static void main(String[] args) {
            // Generate random array
            int[] arr = new int[20];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100 + 1); // Generate random numbers between 1 and 100
            }
    
            // Separate even, odd, and prime numbers
            int evenCount = 0;
            int oddCount = 0;
            int primeCount = 0;
            for (int num : arr) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                    if (isPrime(num)) {
                        primeCount++;
                    }
                }
            }
    
            // Create separate arrays for even, odd, and prime numbers
            int[] even = new int[evenCount];
            int[] odd = new int[oddCount];
            int[] prime = new int[primeCount];
    
            // Fill the separate arrays
            int evenIndex = 0;
            int oddIndex = 0;
            int primeIndex = 0;
            for (int num : arr) {
                if (num % 2 == 0) {
                    even[evenIndex++] = num;
                } else {
                    odd[oddIndex++] = num;
                    if (isPrime(num)) {
                        prime[primeIndex++] = num;
                    }
                }
            }
    
            // Print original array
            System.out.println("Original array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
    
            // Print even numbers array
            System.out.println("Even numbers: ");
            for (int num : even) {
                System.out.print(num + " ");
            }
            System.out.println();
    
            // Print odd numbers array
            System.out.println("Odd numbers: ");
            for (int num : odd) {
                System.out.print(num + " ");
            }
            System.out.println();
    
            // Print prime numbers array
            System.out.println("Prime numbers: ");
            for (int num : prime) {
                System.out.print(num + " ");
            }
            System.out.println();
    
            // Sort original array (ascending)
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
    
            System.out.println("Sorted array (ascending): ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
    
            // Sort a copy of the original array (descending)
            int[] sortedDescending = new int[arr.length];
            System.arraycopy(arr, 0, sortedDescending, 0, arr.length);
            for (int i = 0; i < sortedDescending.length - 1; i++) {
                for (int j = i + 1; j < sortedDescending.length; j++) {
                    if (sortedDescending[i] < sortedDescending[j]) {
                        int temp = sortedDescending[i];
                        sortedDescending[i] = sortedDescending[j];
                        sortedDescending[j] = temp;
                    }
                }
            }
    
            System.out.println("Sorted array (descending): ");
            for (int num : sortedDescending) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    
    


}//end class 