//Write a Java Program to find the Factorial of given number. 

/*
import java.util.Scanner;

class Factorial
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number to find its factorial: ");
    int num = scanner.nextInt();

    long fact = 1;
    while(num != 0)
    {
        fact *= num;
        num--;
    }
    System.out.println("Factorial is: " + fact);
    }
    
}
*/

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number to find its factorial: ");
       int num = sc.nextInt();

       int fact = 1;
       for(int i = 1; i <= num; i++) {
        fact *= i;
       }
       System.out.println("Factorial is: " + fact);
    }
}