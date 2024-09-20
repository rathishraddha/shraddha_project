import java.util.*;

public class LongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("first string: ");
        String first = sc.nextLine();

        System.out.println("second string: ");
        String second = sc.nextLine();

        System.out.println("third string: ");
        String third = sc.nextLine();

        String longest = first;

        if(second.length() > first.length())
        {
            longest = second;
        }
        if(third.length() > second.length())
        {
            longest = third;
        }
        
        System.out.println("Longest string is: " + longest);
        System.out.println("length: " + longest.length());
    }
}