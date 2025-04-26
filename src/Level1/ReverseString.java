package Level1;

public class ReverseString {
    public static void main(String args[]) {
        String str = "abcd";
        char c[] = str.toCharArray();
        int begin = 0, end = c.length - 1;
        while (end > begin) {
            char temp = c[end];
            c[end] = c[begin];
            c[begin] = temp;
            end--;
            begin++;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
    }
}