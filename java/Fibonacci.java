/*
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input
        System.out.println("Enter the number of terms to print in the Fibonacci series: ");
        int n = scanner.nextInt(); // Read user input

        // Validate the input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            printFibonacciSeries(n); // Call the method to print Fibonacci series
        }
        
        scanner.close(); // Close the Scanner object
    }

    public static void printFibonacciSeries(int n) {
        // First two terms of the Fibonacci series
        
        int a = 0, b = 1;
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            // Compute the next term
            int nextTerm = a + b;
            // Update the terms
            a = b;
            b = nextTerm;
        }
        System.out.println(); // Move to the next line after printing the series
    }
}
*/

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input
        System.out.println(" Enter the number of terms to print in the Fibonacci series: ");
        int n = scanner.nextInt(); // Read user input

        // Validate the input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            printFibonacciSeries(n); // Call the method to print Fibonacci series
        }
        
        scanner.close(); // Close the Scanner object
    }

    public static void printFibonacciSeries(int n) {
        // First two terms of the Fibonacci series
        int a = 0, b = 1;
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            // Compute the next term
            int nextTerm = a + b;
            // Update the terms
            a = b;
            b = nextTerm;
        }
        System.out.println(); // Move to the next line after printing the series
    }
}
