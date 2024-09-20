//Add spaces

import java.util.Arrays;

public class AddSpaces {

    public static String addSpaces(String str, int[] spaces){
        
        char[] chars = str.toCharArray();
        Arrays.sort(spaces);
       
        StringBuilder sb = new StringBuilder();
        int prevIndex = 0;

        for(int index : spaces){
            if(index < str.length()){
                sb.append(str.substring(prevIndex, index)).append(' ');

                prevIndex = index;
            }
        }

        sb.append(str.substring(prevIndex));
        
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "MynameisShraddha";
        int[] arr = {2,6,8};
        String spaces = "";
        
        String result = addSpaces(str, arr);
        System.out.print(result);
    }
}