package Level1;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        int x = 20;
        int count;
        for (int i = 1; i < x; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}