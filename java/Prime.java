import java.util.Scanner;

public class Prime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();   
    
    boolean flag = false;
    for (int i = 2; i <= num / 2; i++) {
      // condition for nonprime number
      if (num % i == 0) 
      {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
} 

/*
public class Prime {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Check if the number is less than or equal to 1
        if (num <= 1) {
            return false;
        }

        // Check for factors from 2 to num / 2
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false; // Found a divisor, not a prime number
            }
        }
        return true; // No divisors found, number is prime
    }

    public static void main(String[] args) {
        int N = 20; // Define the range up to which you want to find prime numbers

        System.out.println("Prime numbers from 1 to " + N + " are:");

        // Iterate through numbers from 1 to N
        for (int num = 1; num <= N; ++num) {
            if (isPrime(num)) {
                System.out.println(num); // Print the prime number
            }
        }
    }
}
*/