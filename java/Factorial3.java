//using recursion

import java.util.Scanner;

public class Factorial3 {

    // Recursive method to calculate factorial
    public static long factorialRecursive(int num) {
        if (num == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return num * factorialRecursive(num - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();

        // Validate input
        if (num < 0) 
        {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
        else 
        {
            // Calculate factorial using recursion
            long fact = factorialRecursive(num);
            System.out.println("Factorial is: " + fact);
        }

        // Close the scanner
        scanner.close();
    }
}
