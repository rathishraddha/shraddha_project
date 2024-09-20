// Write a Java Program to print all the Factors of the Given number.

import java.util.Scanner;

public class Factors
{
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("number: ");
    int num = sc.nextInt();

    for(int i=1; i<=num; i++)
    {
        if(num%i == 0)
        {
            System.out.println("Factorial of number: " + i);
        }
        else
        {
            System.out.println("not a factorial: " + i);
        }
    }

   }
}