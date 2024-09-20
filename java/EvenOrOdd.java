/*class EvenOrOdd 
{
    public void even(int num)
    {
        if(num%2 == 0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args)
    {
        EvenOrOdd obj = new EvenOrOdd();
        obj.even(7);
    } 
}*/

import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Take a number from user: ");
        int num = sc.nextInt();
        
        if(num%2 == 0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }

        sc.close();

    }
}