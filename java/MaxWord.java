//Maximum words

public class MaxWord {

    public static int countWords(String str){
        int count = 0;
        for(char c: str.toCharArray()){
            if(Character.isWhitespace(c))
            {
                count++;
            }
        }
        return count+1;
    }

    public static int maxCountWord(String[] strings){
        int maxLetterCount = 0;

            for(String str : strings){
                int wordCount = countWords(str);

                if(wordCount>maxLetterCount){
                    maxLetterCount = wordCount;
                }
            }

            return maxLetterCount;
    }
    public static void main(String args[]){
        String input[] = {"we are the Avengers", "im iron man", "Avengers are in the end game"};
        int maxLetterCount = maxCountWord(input);
        System.out.println("Max word in a string is : "+ maxLetterCount);
    }
}