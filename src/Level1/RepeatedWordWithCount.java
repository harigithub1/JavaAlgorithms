package Level1;

public class RepeatedWordWithCount {
  public static void main(String[] args) {
    //input String
    String input = "Java is widely used in building web application and mobile application";
    //split the words from String
    String[] words = input.split(" ");
    //variable for getting repeated word count
    int wc = 1;
    //outer loop for comparison
    for (int i = 0; i < words.length; i++) {
      //inner loop for comparison
      for (int j = i + 1; j < words.length; j++) {
        //checking if both strings are equal
        if (words[i].equals(words[j])) {
          //if equal then increment the count
          wc = wc + 1;
          //replace repeated words by zero
          words[j] = "0";
        }
      }
      if (words[i] != "0")
        //printing the word along with count
        if (wc > 1)
          System.out.println("the word " + "'" + words[i] + "'" + " is repeated " + wc + " times");
      wc = 1;
    }
  }
}