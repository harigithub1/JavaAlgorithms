package Level1;

public class NumberReverse {
    public static void main(String[] args) {
        int n = 1234, reversedNum = 0;
        while (n != 0) {
            reversedNum = reversedNum * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(reversedNum);
    }
}
