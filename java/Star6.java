//diamond pattern

import java.util.*;

public class Star6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take a number: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Use print instead of println
            }
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Use print instead of println
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " "); // Use print instead of println
            }
            System.out.println(); // Move to the next line
        }
        
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Use print instead of println
            }
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Use print instead of println
            }
            // Print decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " "); // Use print instead of println
            }
            System.out.println(); // Move to the next line
        }

        sc.close(); // Close the scanner
    }
}
