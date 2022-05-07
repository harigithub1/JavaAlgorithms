package Level1;

class Armstrong {
  public static void main(String[] args) {
    int x = 0, rm, temp;
    int n = 153;// It is the number to check armstrong
    temp = n;
    while (n != 0) {
      rm = n % 10;
      x = x + (rm * rm * rm);
      n = n / 10;
    }
    if (temp == x)
      System.out.println(temp + " is armstrong number");
    else
      System.out.println(temp + " is not armstrong number");
  }
}