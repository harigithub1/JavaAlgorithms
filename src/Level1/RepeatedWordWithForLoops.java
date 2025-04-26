package Level1;

public class RepeatedWordWithForLoops {
  public static void main(String[] args) {
    String input = "Java is widely used in building web application and mobile application";
    String[] words = input.split(" ");
    //variable for getting repeated word count
    int wc = 1;
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (words[i].equals(words[j])) {
          wc = wc + 1;
          //replace repeated words by zero
          words[j] = "0";
        }
      }
      if (words[i] != "0")
        if (wc > 1)
          System.out.println("the word " + "'" + words[i] + "'" + " is repeated " + wc + " times");
      wc = 1;
    }
  }
}