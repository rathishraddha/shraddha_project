//given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

public class Array3
{
    public static void main(String[] args)
    {
        int[] arr = {55,2,0,8,1,5,2};

        for(int i=0; i<arr.length; i++)
        {
        if(arr[i] == 0)
        System.out.println("zero");
        if(arr[i] == 1)
        System.out.println("one");
        if(arr[i] == 2)
        System.out.println("two");
        }
    }
}