package Level1;

import java.util.*;

public class DuplicateWord {
//@SuppressWarnings("unchecked")
public static void main(String[] args) {

    String text = "hari hari babu raju ramesh ramesh kalyan";

    List<String> list = Arrays.asList(text.split(" "));

    Set<String> uniqueWords = new HashSet<String>(list);
    for (String word : uniqueWords) {
    	if(Collections.frequency(list, word)>1) {
    		System.out.println(word+" "+ Collections.frequency(list, word));
    	}
   //     System.out.println(word + ": " + Collections.frequency(list, word));
    }
}
}