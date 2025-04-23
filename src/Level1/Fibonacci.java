package Level1;

public class Fibonacci {

  public static void main(String[] args) {
    int n1 = 0, n2 = 1, n3, numbers=5;
    System.out.println(n1);
    System.out.println(n2);
    for (int i = 0; i < numbers; i++) {
      n3 = n1 + n2;
      System.out.println(n3);
      n1 = n2;
      n2 = n3;
    }
  }
}
