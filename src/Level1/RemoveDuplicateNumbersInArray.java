package Level1;

import java.util.Arrays;

public class RemoveDuplicateNumbersInArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 3, 1, 2, 3, 4, 4, 3, 2, 7, 8, 8, 8, 2, 0, 2};
        int temp[] = new int[arr.length];
        Arrays.sort(arr);
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j++] = arr[arr.length - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        for (int i = 0; i < j; i++) {
            System.out.println(arr[i]);
        }
    }
}