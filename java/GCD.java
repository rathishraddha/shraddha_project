public class GCD {
    public static int gcd(int a, int b){
        if(a == b){
            return a;
        }
        if(a > b){
            return gcd(b, a-b);
        }
        else{
            return gcd(a, b-a);
        }
    }
    public static void main(String[] args) {
        System.out.println(gcd(108, 88));
    }
}