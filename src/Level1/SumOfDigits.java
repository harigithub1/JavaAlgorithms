package Level1;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1234, rem = 0;
        while (n > 0) {
            rem = rem + n % 10;
            n = n / 10;
        }
        System.out.println(rem);
    }
}