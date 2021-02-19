package Level1;

import java.io.*;

/*to find if the given number is present in the array or not*/
public class GivenValuePresentOrNotArray {
	static int k;
	static int l;

	public String check(int arr[], int k) {
		boolean b = false;
		String b1 = null;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				b = true;
				break;
			}
		}
		if (b)
			b1 = "Yes";
		else
			b1 = "No";
		return b1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		GivenValuePresentOrNotArray obj = new GivenValuePresentOrNotArray();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("enter the element to be searched");
		k = Integer.parseInt(br.readLine());
		System.out.println("enter the length of the array");
		l = Integer.parseInt(br.readLine());
		int arr[] = new int[l];
		System.out.println("enter the array elements");
		for (int i = 0; i < l; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		String result = obj.check(arr, k);
		System.out.println(result);

	}
}