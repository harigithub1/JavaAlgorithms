package Level1;

public class SwapTwoStringsWithoutThirdVariable {
    public static void main(String[] args) {
        String s1 = "abcd", s2 = "efgh";
        s1 = s1 + s2;
        s2 = s1.substring(0, 4);//or (0,s1.length()-s2.length()) to pass dynamically
        s1 = s1.substring(3, 7);//or (s2.length) to pass dynamically
        System.out.println("s1 " + s1);
        System.out.println("s2 " + s2);
    }
}