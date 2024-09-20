public class PrintArray {

    public static void printAlternate(char a[],int b[],int n1,int n2){
        int maxLength=(n1>n2)?n1:n2;
        int i=0;
        int j=0;
        for(int k=0;k<maxLength;k++){
            if(i<n1){
                System.out.print(a[i]+" ");
                i++;
                if(i<n1){
                    System.out.print(a[i]+" ");
                    i++;
                }
            }

             if(j<n2){
                System.out.print(b[j]+" ");
                j++;
                if(j<n2){
                    System.out.print(b[j]+" ");
                    j++;
                }
            }
        }
    }
    public static void main(String args[]){
        char a[]={'a','b','c','d','f'};
        int b[]={1,2,3,4};
        int n1=a.length;
        int n2=b.length;
        int maxLength=(n1>n2)?n1: n2;
       printAlternate(a,b,n1,n2);
    }
}