public class _3ValidAnagramLC242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26]; // for lowercase letters
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }
}

// valid anagrm vs anagram
// space special chars and case is ignored in anagram

//anagram/valid anagram vs palindrome 
// order is ignored in anagram/valid anagram but not in palindrome 

//Pattern: Frequency Counting pattern with a fixed-size counting array
//Time complexity — O(n), Space complexity — O(1)
