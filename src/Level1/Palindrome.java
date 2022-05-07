package Level1;

import java.util.Scanner;

public class Palindrome {

	

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		String strRev="";
		for (int i = str.length() - 1; i >= 0; i--) {
			strRev = strRev + str.charAt(i);
		}
		if (str.equalsIgnoreCase(strRev)) {
			System.out.println(str + " is palindrome");
		}else
			System.out.println(str + " is not palindrome");
	}

}
