// source - Joe James https://www.youtube.com/watch?v=lCDZ0IprFw4

// Time complexity is O of n square - dont use it

import java.util.ArrayList;

public class InsertionSortArrayList {
    public ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
        int i, j, key, temp;
        for (i = 1; i < list.size(); i++) {
            key = list.get(i);
            j = i - 1;
            while (j >= 0 && key < list.get(j)) {
                temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
                j--;
            }
        }
        return list;
    }

    public static void main(String args[]) {
        InsertionSortArrayList i = new InsertionSortArrayList();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(2);
        i.insertionSort(list);
        for (Integer a : list) {
            System.out.print(a+", ");
        }
    }
}
