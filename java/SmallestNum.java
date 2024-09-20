//Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol? 

import java.util.Scanner;

public class SmallestNum {

    static int smallest(int x, int y, int z)
    {
        int c = 0;

        while (x != 0 && y != 0 && z != 0) {
            x--;
            y--;
            z--;
            c++;
        }

        return c;
    }

    public static void main(String[] args)
    {
        int x = 12, y = 15, z = 5;

        System.out.printf("Minimum of 3" + " numbers is %d",smallest(x, y, z));

    }
}
