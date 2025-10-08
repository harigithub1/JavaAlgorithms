package Level1;

public class FibonacciWithRecursion {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // base case 1
        } else if (n == 1) {
            return 1; // base case 2
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // recursive relation
        }
    }
}
