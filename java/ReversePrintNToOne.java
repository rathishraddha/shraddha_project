import java.util.Scanner;

public class ReversePrintNToOne
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--)
        {
            //System.out.println("The numbers are:");
            System.out.println(i);
        }
    }
}