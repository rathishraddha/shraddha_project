//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo 

/*
import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 1, 0, 2, 0, 1};
        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        arr = Arrays.stream(arr).sorted().toArray();
    }
}
*/

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 1, 0, 2, 0, 1};
        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}