//Write a program to find SUM OF PRIME numbers?

import java.util.Scanner;

public class Sumofprime {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        int sum = 0;

        for (int i = 2; i <= range; i++) { // Start from 2 since 1 is not a prime number
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Sum of prime numbers up to " + range + " is: " + sum);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        if (num == 2) return true; // 2 is the only even prime number
        if (num % 2 == 0) return false; // No other even number is prime

        // Check for factors from 3 up to the square root of num
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}