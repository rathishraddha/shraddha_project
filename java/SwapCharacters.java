//Swap alphabetic characters in the array, keeping special characters in their original position

public class SwapCharacters {
    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c', 'd', 'A', '$'};
        char[] arr2 = {'a', 'b', 'c', 'D', '$', 'e', '!', 'f'};
        
        swapAlphabeticChars(arr1);
        swapAlphabeticChars(arr2);

        System.out.println(arr1); // Output: [A, d, c, b, a, $]
        System.out.println(arr2); // Output: [f, e, D, c, $, b, !, a]
    }

    public static void swapAlphabeticChars(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                // Swap alphabetic characters
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}