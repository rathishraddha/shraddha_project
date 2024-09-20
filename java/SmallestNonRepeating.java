//Find the smallest non-repeating element in the first array

public class SmallestNonRepeating {
    public static void main(String[] args) {
        int[] arr1 = {10, -4, 2, 0, -2, 3, 7};
        int[] arr2 = {7, 3, -4, 0, 3, 2};
        
        System.out.println(findSmallestNonRepeating(arr1, arr2)); // Output: 10

        int[] arr3 = {-2, 5, 1, -10, 5};
        int[] arr4 = {-2, -10};
        
        System.out.println(findSmallestNonRepeating(arr3, arr4)); // Output: 1
    }

    public static int findSmallestNonRepeating(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return arr1[i];
            }
        }
        return -1; // Return -1 if no non-repeating element is found
    }
}