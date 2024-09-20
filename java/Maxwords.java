public class Maxwords {

    public static int countWords(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                count++;
            }
        }
        return count + 1; // Moved this outside the for-loop
    }

    public static int maxCountWord(String[] strings) {
        int maxLetterCount = 0;

        for (String str : strings) {
            int wordCount = countWords(str);

            if (wordCount > maxLetterCount) {
                maxLetterCount = wordCount;
            }
        }
        return maxLetterCount; // Fixed return type from void to int
    }

    public static void main(String[] args) {
        String[] input = {"i'm shraddha", "my name is shraddha rathi", "i am always a good girl as per my teacher"};
        int maxLetterCount = maxCountWord(input);
        System.out.println("Max word count in a string is: " + maxLetterCount);
    }
}
