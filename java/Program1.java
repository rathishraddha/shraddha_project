//find kth max  element from

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();

        int array[] =  new int[size];

        System.out.println("Enter Array Elements");
        for(int i = 0; i<size ; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Length of array "+array.length);

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i]<array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Enter kth elements");
        int kth = sc.nextInt();

        //System.out.println(array[kth-1]);

        for (int i = 0; i < kth; i++) {
            System.out.print(array[i]+" ");
        }
    }
}