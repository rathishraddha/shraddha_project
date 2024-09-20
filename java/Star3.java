//Write a program to display the HALLOW BOX with stars?

/*
import java.util.*;

public class Star3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take the input: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i==0 || i==n-1 || j==0 || j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/

// Write a program to display the BOX and CROSS inside it with stars?

import java.util.*;

public class Star3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take the input: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i==0 || i==n-1 || j==0 || j==n-1 || i==j || i+j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}