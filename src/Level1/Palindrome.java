package Level1;

public class Palindrome {
    public static void main(String[] args) {
        String str = "hari";
        String strRev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strRev = strRev + str.charAt(i);
        }
        if (str.equalsIgnoreCase(strRev)) {
            System.out.println(str + " is palindrome");
        } else
            System.out.println(str + " is not palindrome");
    }
}
