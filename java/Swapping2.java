//Swap two numbers with using third variable approach 1. 

public class Swapping2
{
public static void swap(int a,int b)
{
    System.out.println("before swapping: " + a + b);
    int temp = a;
    a = b;
    b = temp;

    System.out.println("after swapping: " + a + b);
}

public static void main(String[] args)
{
    swap(4,2);
}
}