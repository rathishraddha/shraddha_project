//count the characters of string

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       System.out.println("Enter a string: ");
       String str = sc.nextLine();

       //count characters
       int characterCount = str.length();

       System.out.println("Total count: " + characterCount);

       sc.close();
    }
}