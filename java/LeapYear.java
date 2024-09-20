import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("year: ");
        int year = sc.nextInt();

        if(year%4 == 0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Normal year");
        }

        sc.close();
    }
}