public class Addition
{
    public static int add(int a,int b)
    {
        for(int i=1; i<=b; i++)
        {
            a++;
        }
        return a;
    }

    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        int result = add(a,b);

        System.out.println("addition of two numbers: "+result);
    }
}