package Level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedCharsInStringUsingMap {
      public static void main(String[] args) {
        String str = "java va";
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        Set<Character> keys = map.keySet();
        for (char ch : keys) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " is repeated " + map.get(ch) + " times");
            }
        }
    }
}
