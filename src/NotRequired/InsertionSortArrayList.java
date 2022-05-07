package NotRequired;// source - Joe James https://www.youtube.com/watch?v=lCDZ0IprFw4

// Time complexity is O of n square - dont use it

import java.util.ArrayList;

public class InsertionSortArrayList {
  public ArrayList<Integer> insertionSort(ArrayList<Integer> arrayList) {
    int i, j, key, temp;
    for (i = 1; i < arrayList.size(); i++) {
      key = arrayList.get(i);
      j = i - 1;
      while (j >= 0 && key < arrayList.get(j)) {
        temp = arrayList.get(j);
        arrayList.set(j, arrayList.get(j + 1));
        arrayList.set(j + 1, temp);
        j--;
      }
    }
    return arrayList;
  }

  public static void main(String args[]) {
    InsertionSortArrayList i = new InsertionSortArrayList();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(6);
    arrayList.add(8);
    arrayList.add(1);
    arrayList.add(4);
    arrayList.add(5);
    arrayList.add(3);
    arrayList.add(7);
    arrayList.add(2);
    i.insertionSort(arrayList);
    for (Integer a : arrayList) {
      System.out.print(a + ", ");
    }
  }
}
