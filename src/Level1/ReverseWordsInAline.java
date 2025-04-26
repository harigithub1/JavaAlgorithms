package Level1;

public class ReverseWordsInAline {
    public static void main(String[] args) {
        String s = "java prog lang";
        String a[] = s.split(" ");
        int x = 0, y = a.length - 1;
        String temp;
        while (y > x) {
            temp = a[y];
            a[y] = a[x];
            a[x] = temp;
            x++;
            y--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}