import java.util.Scanner;

public class PositiveOrNegative
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("number: ");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println("number is positive");
        }
        else if(num<0)
        {
            System.out.println("number is negative");
        }
        else
        {
            System.out.println("zero");
        }

        sc.close();
    }
}