import java.util.Scanner;

public class PrintOneToN
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            //System.out.println("The numbers are:");
            System.out.println(i);
        }
    }
}