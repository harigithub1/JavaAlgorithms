package Level1;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWordsInLineUsingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String s = "java is prog lang java is java";
        String[] sa = s.split(" ");
        for (String a : sa) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}