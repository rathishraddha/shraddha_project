public class CommonElements {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {3, 5, 6, 7, 8};

        int n1 = arr1.length;
        int n2 = arr2.length;

        // Using a for loop with manual pointer increments
        for (int i = 0, j = 0; i < n1 && j < n2;) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i]);  // Print common element
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;  // Move pointer in arr1 forward
            } else {
                j++;  // Move pointer in arr2 forward
            }
        }
    }
}