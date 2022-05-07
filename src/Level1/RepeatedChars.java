package Level1;

public class RepeatedChars {
  public static void main(String[] args) {
    String input = "Welcome";    //Input String
    char[] chars = input.toCharArray();  //Split the word from String
    int wordCount = 1;              //Variable for getting Repeated word count

    for (int i = 0; i < chars.length; i++)    //Outer loop for Comparison
    {
      for (int j = i + 1; j < chars.length; j++)  //Inner loop for Comparison
      {

        if (chars[i] == chars[j])  //Checking if both strings are equal
        {
					wordCount = wordCount + 1;        //if equal increment the count
          chars[j] = 'a';      //Replace repeated words by zero
        }
      }
      if (chars[i] != 'a' && wordCount>1)
        System.out.println(chars[i] + "--" + wordCount);  //Printing the word along with count
			wordCount = 1;
    }
  }
}