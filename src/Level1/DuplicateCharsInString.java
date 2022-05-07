package Level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
  public static void main(String[] args) {
    String str = "java";
    //initially below hashmap is empty
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    char[] charArray = str.toCharArray();
    for (Character ch : charArray) {
      if (map.containsKey(ch)) {
                /*if the character is already present in hashmap then incrementing its value by one.
                (initially hashmap will be empty. so, it will not come to this if condition.)*/
        map.put(ch, map.get(ch) + 1);
      } else {
        //adding char to hashmap if it doesn't exist already
        map.put(ch, 1);
      }
    }
    Set<Character> keys = map.keySet();
    for (Character ch : keys) {
      if (map.get(ch) > 1) {
        System.out.println(ch + " is repeated " + map.get(ch) + " times");
      }
    }
  }
}