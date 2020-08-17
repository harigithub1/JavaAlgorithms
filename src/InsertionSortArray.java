// source - Joe James https://www.youtube.com/watch?v=lCDZ0IprFw4

// Time complexity is O of n square - dont use it

public class InsertionSortArray {
    public static void main(String args[]) {
        int[] a = {5, 8, 1, 3, 9, 6};
        int i, j, key, temp;
        for (i = 1; i < a.length; i++) {
            key = a[i]; // initially key will be second element i.e. 8
            j = i - 1;  // initially j will be the first element index i.e. 1
            while (j >= 0 && key < a[j]) {   // if key is greater than the left side element then it will not go to the loop
                                             // or else it will enter the loop and compares with all the elements on its left
                                             // untill it finds an left side element which is less than key
                temp = a[j]; // i=2,j=1, key= 1,a[j]=8, temp = 8
                a[j] = a[j + 1]; //a[j]= 1
                a[j + 1] = temp; //a[j+1] = 8
                j--;
            }
        }
        for (int x : a) {
            System.out.print(x + ", ");
        }
    }
}