
public class Fibonacci {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, fib;
		for (int i = 0; i < 5; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;

		}

	}

}
