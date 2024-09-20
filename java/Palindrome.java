//Check whether the Given Numberis a Palindrome or NOT.

class Palindrome {  
    public static void main(String args[]) {  
        int r, sum = 0, temp;    
        int n = 454; // The number variable to be checked for palindrome  
  
        temp = n;    
        while (n > 0) {    
            r = n % 10;  // Getting the last digit of n
            sum = (sum * 10) + r;  // Building the reversed number
            n = n / 10;  // Removing the last digit from n
        }    
        if (temp == sum)    
            System.out.println(n + "Palindrome number");    
        else    
            System.out.println(n + "Not palindrome");    
    }     
}


/*
n = 454
sum = 0
temp = n = 454
*/