//Swap two numbers without using third variable approach 1. 

public class Swapping1
{
public static void swap(int a,int b)
{
    System.out.println("before swapping: " + a + b);
    a = a+b; //4+2=6
    b = a-b; //6-2=4
    a = a-b; //6-4=2

    System.out.println("after swapping: " + a + b);
}

public static void main(String[] args)
{
    swap(4,2);
}
}