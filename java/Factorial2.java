//using function

import java.util.Scanner;

public class Factorial2
{
    
public static void Calculate()
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

    scanner.close();
    }
    

    public static void main(String[] args)
    {
     Calculate();

    }
    }