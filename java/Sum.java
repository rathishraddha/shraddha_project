// Write a Java Program to find sum of the digits of a given number.

import java.util.Scanner;

public class Sum
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0) 
        {
            int num = n%10;
            System.out.println("num is: " + num);
            n=n/10;
            sum = sum + num;
            System.out.println("sum: "+ sum);
        }
    }
}