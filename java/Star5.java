// Write a program to display RIGHT ANGLE triangle with stars?
/*
import java.util.*;

public class Star5 {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Take a number: ");
   int n = sc.nextInt();

   for(int i=1; i<=n; i++) {
    for(int j=0; j<i; j++) {
        System.out.print("* ");
    }
    System.out.println();
   }
  }
}
*/

// Write a program to display Reverse Triangle with stars?

/*
import java.util.*;

public class Star5 {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Take a number: ");
   int n = sc.nextInt();

   for(int i=n; i>0; i--) {
    for(int j=0; j<i; j++) {
        System.out.print("* ");
    }
    System.out.println();
   }
  }
}
*/

// Write a program to display MIRROR of RIGHT ANGLE triangle with stars?

/*
import java.util.Scanner;

public class Star5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        sc.close();  // Always good practice to close the scanner
    }
}
*/

// Write a program to display DOWNWARD MIRROR of RIGHT ANGLE triangle with stars?

import java.util.*;

public class Star5 {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Take a number: ");
   int n = sc.nextInt();

   for(int i=n; i>=1; i--) {
    for(int j=1; j<=i; j++) {
        System.out.print("* ");
    }
    System.out.println();
   }
  }
}