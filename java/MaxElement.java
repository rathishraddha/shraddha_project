import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int array[] = new int[n];
        System.out.println("Enter " + n + " elements:");

        // Input elements into the array
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Initialize max to the first element
        int max = array[0];

        // Iterate through the array to find the maximum element
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Maximum element in the array: " + max);
        sc.close(); 
    }
}
