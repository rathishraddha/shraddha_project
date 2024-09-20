//Write a Java Program to print the digits of a Given Number. 

import java.util.Scanner;

public class Digit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("number: ");
        int n = sc.nextInt();
        while(n!=0) {
            int num = n%10;
            System.out.println(num);
            n=n/10;
            System.out.println("num: "+n);
       }
    }
}