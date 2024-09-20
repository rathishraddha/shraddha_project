//move all the negative numbers to one side of array

/*
import java.util.*;
public class NegativeArray
{
    public static void move(int[] arr)
    {
        Arrays.sort(arr);
    }

    public static void main(String[] args)
    {
        int[] arr = {-1,-2,4,44,-96,100};
        move(arr);
        for(int e : arr)
        System.out.println(e + "");
    }
}
*/

import java.util.*;

public class NegativeArray
{
    public static void move(int[] arr)
    {
        Arrays.sort(arr);
    }

    public static void main(String[] args)
    {
        int[] arr = {-8,0,-9,22,100,66,-5,-55};
        move(arr);
        System.out.println("sorted array is:" + Arrays.toString(arr));

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < 0)
            {
                System.out.println("negative elements:"+arr[i]);
            }
            else if(arr[i] > 0)
            {
                System.out.println("positive elements:"+arr[i]);
            }
        }
    }
}


/*
import java.util.*;

public class NegativeArray {
    public static void move(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;

        // First add all negative numbers to the result array
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                result[index++] = arr[i];
            }
        }

        // Then add all non-negative numbers to the result array
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                result[index++] = arr[i];
            }
        }

        // Copy the result array back to arr
        System.arraycopy(result, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, 4, 44, -96, 100};
        move(arr);
        System.out.println("Array with negative numbers moved to one side: " + Arrays.toString(arr));
    }
}
*/
