package Level1;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharsInStringExample2 {

    public static void main(String args[]) {
        // find repeated letters prog
        String word = "abcdddd";
        Character c[] = new Character[word.length()];
        for (int i = 0; i < word.length(); i++) {
            c[i] = word.charAt(i);
        }
        Map<Character, Integer> a = new HashMap<Character, Integer>();
        int x = 1;
        for (int i = 0; i < word.length(); i++) {
            if (a.containsKey(c[i])) {
                a.put(c[i], x + 1);
                x++;
            } else {
                a.put(c[i], 0);
            }
        }
        for (Map.Entry<Character, Integer> b : a.entrySet()) {
            System.out.println(b.getKey() + "," + b.getValue());
        }
    }
}