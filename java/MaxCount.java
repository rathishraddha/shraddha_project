//Maximum count

public class MaxCount {

    public static int countLetters(String str){
        int count = 0;
        for(char c: str.toCharArray()){
            if(Character.isLetter(c)){
                 count++;
            }
        }
        return count;
       }

       public static int findMaxLetter(String[] strings){
            int maxLetterCount = 0;

            for(String str : strings){
                int letterCount = countLetters(str);

                if(letterCount > maxLetterCount){
                    maxLetterCount = letterCount;
                }
            }
            return maxLetterCount;
       }
      
    public static void main(String args[]){
        String input[] = {"we are the Avengers", "im iron man", "Avengers are in the end game"};

            int maxLetterCount = findMaxLetter(input);
            System.out.println("Count of maximum letters in string : "+ maxLetterCount);
       
        
    }
}