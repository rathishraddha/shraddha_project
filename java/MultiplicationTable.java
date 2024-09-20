//Program to print one table

/*
import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        for(int i=1; i<=10 ; i++)
        {
            int result = num*i;
            System.out.println(num + "*" + i + "=" + result);
        }
    }
}
*/

//Program to print n number of tables

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tables: ");
        int num = sc.nextInt();

        // Print multiplication tables from 1 to num
        for (int i = 1; i <= num; i++) {
            System.out.println("Multiplication table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int result = i * j; // Compute the multiplication result
                System.out.println(i + " * " + j + " = " + result); // Print the result
            }
            System.out.println(); // Print a blank line between tables
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
