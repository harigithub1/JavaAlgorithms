package Level1;

public class FactorialWithRecursion {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
