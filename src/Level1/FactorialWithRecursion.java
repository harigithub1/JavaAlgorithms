package Level1;

public class FactorialWithRecursion {
    public static void main(String[] args) {
        FactorialWithRecursion factorialWithRecursion = new FactorialWithRecursion();
        System.out.println(factorialWithRecursion.factorial(5));
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}