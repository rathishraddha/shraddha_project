//reverse array

import java.util.Arrays;

class Array1
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        System.out.println("Original array: ");  

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + "");
            //System.out.println(Arrays.toString(arr));
        }

        System.out.println();  

            System.out.println("array in reverse order");
            for(int i = arr.length-1; i>=0; i-- )
            {
                System.out.println(arr[i] + "");
            }
        
    }
}