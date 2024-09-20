/*
public class Test {

    public static void main(String args[]) {

        int x[] = {1, 2, 3, 4, 5, 6, 7, 8}; // Fixed the syntax error by replacing ')' with '}'
        int i;

        for (i = 2; i < 6; ++i) {
            x[x[i]] = x[i];
        }

        for (i = 0; i < 8; ++i) {
            System.out.print(x[i]); // Fixed the syntax error by replacing 'x(i)' with 'x[i]'
        }
    }
}
*/

/*
public class Test {

    public static void main(String args[]) {

        int a[] = {5, 1, 7}; // Fixed the syntax error by replacing ')' with ']'
        int sum = 0;

        for (int i = 0; i < a.length; i += 2) {
            sum = sum + a[i];
            i--; // This line will affect the loop's behavior
        }

        System.out.print(sum);
    }
}
*/

public class Test {

    public static void main(String args[]) {

        int a = 511709;
        int sum = 0;

        while (a != 0) {
            int x = a % 10; 
            sum += x; 
            a /= 10; 
        }

        System.out.println(sum);
    }
}


