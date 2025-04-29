package Level1;

public class VowelOrConsonant {
    public static void main(String[] args) {
        boolean isVowel = false;
        char a = 'a';
        switch (a) {
            case 'a':
                isVowel = true;
            case 'e':
                isVowel = true;
            case 'i':
                isVowel = true;
            case 'o':
                isVowel = true;
            case 'u':
                isVowel = true;
            default:
                isVowel = false;
        }
        if (isVowel) {
            System.out.println("vowel");
        }
    }
}