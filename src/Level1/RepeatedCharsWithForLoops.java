package Level1;

public class RepeatedCharsWithForLoops {
    public static void main(String[] args) {
        String input = "Welcome";
        char[] chars = input.toCharArray();
        int wordCount = 1;              //Variable for getting Repeated word count
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    wordCount = wordCount + 1;
                    chars[j] = '0';      //Replace repeated words by zero
                }
            }
            if (chars[i] != '0' && wordCount > 1) {
                System.out.println(chars[i] + "--" + wordCount);
            }
            wordCount = 1;
        }
    }
}