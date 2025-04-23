package Level1;

public class FibonacciWithRecursion {
    int n1 = 0, n2 = 1, n3, count = 0;

    public static void main(String[] args) {
        FibonacciWithRecursion fibonacciWithRecursion = new FibonacciWithRecursion();
        fibonacciWithRecursion.fibonacci(5);
    }

    public int fibonacci(int n) {
        if (count == 0) {
            System.out.println(n1);
            System.out.println(n2);
        }
        count++;
        n3 = n1 + n2;
        System.out.println(n3);
        n1 = n2;
        n2 = n3;
        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1);
        }
    }
}
