package Level1;

class Patterns {
  public static void main(String [] args) {
    int size=4;
    int i, j;
    for(i=1;i<=size;i++) {
      for(j=1;j<=size;j++) {
        if((i+j)>size) {
          System.out.print("*");
          System.out.print(" ");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}