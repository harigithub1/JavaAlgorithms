package Level1;

public class ReverseStringUsingCharAt {
    public static void main(String[] args) {
        String str = "abcd";
        String strRev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            strRev = strRev + str.charAt(i);
        }
        System.out.println(strRev);
    }
}
