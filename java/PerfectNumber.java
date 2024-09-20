//perfect number

/*
public class PerfectNumber {
    public static void main(String[] args) {
        int lowerLimit = 1;
        int upperLimit = 100;

        System.out.println("perfect numbers between " + lowerLimit + "and" + upperLimit + ":");

        for(int num=lowerLimit; num<=upperLimit; num++) {
            if(isPerfectNumber(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
*/

//Is perfect number or not?

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);	
	  System.out.println("enter a number: ");	
	  int num = sc.nextInt();	

      int sum = 1;
      for(int i = 2; i <= num/2; i++) 
        {
            if(num%i == 0) 
            sum += i;
        }
        if(sum == num) {
            System.out.println(num + " is a perfect number");
        }
        else 
        {
            System.out.println(num + " is not a perfect number");
        }
    }
}