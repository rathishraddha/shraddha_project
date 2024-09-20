//Write a program to display PRIME NUMBERS from 1 to n?

import java.util.Scanner;

class Prime1
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number: ");
      int num = sc.nextInt();
      System.out.println("Prime numbers between 1 to " + num);

      for(int i=1; i<num; i++)
      {
        boolean Prime=true;

        for(int j=2; j<i; j++)
        {
            if(i%j==0)
            {
                Prime=false;
                break;
            }
        }
        if(Prime)
        {
            System.out.println(i + "");
        }
      }

    }
}