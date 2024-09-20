import java.util.*;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take a input: ");
        int n = sc.nextInt();

        String bin = "";

        while(n > 0) {
            int r = n % 2;
            bin = r + bin;
            n = n / 2;
        }
        System.out.println("Binary Equivalent: " + bin);
    }
}