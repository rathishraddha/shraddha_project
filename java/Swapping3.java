//Swap two numbers without using third variable approach 1. 

public class Swapping3 {

    // Method to swap two integers using multiplication and division
    public static void swap(int a, int b) {
        // Check to prevent division by zero
        if (a == 0 || b == 0) {
            System.out.println("Swapping with multiplication and division is not defined for zero values.");
            return;
        }

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping logic using multiplication and division
        a = a * b; // Step 1: a becomes the product of a and b
        b = a / b; // Step 2: b becomes the original value of a
        a = a / b; // Step 3: a becomes the original value of b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        // Call the swap method with non-zero values
        swap(4, 2);
        swap(-4, 2); // Test with negative number
        swap(-4, -2); // Test with two negative numbers
    }
}
