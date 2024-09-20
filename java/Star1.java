/*
import java.util.*;

public class Star1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take a number: ");
        int n = sc.nextInt();

        // how many n 
        for(int i=0; i<n; i++) 
        {
            for(int j=0; j<n-i-1; j++) 
            {
                System.out.print(" "); //creates spaces
            }
            for(int k=0; k<2*i+1; k++) 
            {
                System.out.print("*"); //add * 
            }
            System.out.println();
        }
    }
}
*/


//Equilateral triangle
/*
import java.util.Scanner;

public class Star1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take a number: ");
        int n = sc.nextInt();

        // Loop to print each line
        for (int i = 0; i < n; i++) 
        {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) 
            {
                System.out.print(" ");
            }
            // Print stars with spaces in between
            for (int k = 0; k <= i; k++) 
            {
                System.out.print("* ");
            }
            // Move to the next line after printing stars
            System.out.println();
        }
    }
}
*/

//Inverted Equilateral triangle

import java.util.Scanner;

public class Star1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take a number: ");
        int n = sc.nextInt();

        // Loop to print each line
        for (int i = 0; i < n; i++) 
        {
            // Print stars with spaces in between
            for (int k = 0; k <= i; k++) 
            {
                System.out.print(" ");
            }
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++)
            {
                System.out.print("* ");
            }
            // Move to the next line after printing stars
            System.out.println();
        }
    }
}