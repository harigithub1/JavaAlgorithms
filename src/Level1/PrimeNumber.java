package Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// use boolean for prime number program

//import java.io.*;

public class PrimeNumber {

  public static void main(String[] args) throws NumberFormatException, IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("enter any number");
    int n = Integer.parseInt(br.readLine());
    boolean isprime = true;
    if (n == 1 || n == 0)
      isprime = false;
//		when we input 2 or 3 it will not go to below for loop as isprime is
//		already set to true it will print prime
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        isprime = false;
        break;
      }
    }
    if (isprime) System.out.println("prime");
    else System.out.println("not prime");
  }
}
