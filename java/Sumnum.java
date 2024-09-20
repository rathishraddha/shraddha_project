import java.util.Scanner;

class Sumnum
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of n: ");
    int n = sc.nextInt();
    int sum = 0;
    for(int i=0; i<=n; i++)
    {
       sum += i;
    }
    System.out.println(sum);
    }
}