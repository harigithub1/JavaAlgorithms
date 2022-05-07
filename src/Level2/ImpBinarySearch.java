package Level2;

// https://www.geeksforgeeks.org/binary-search/
class ImpBinarySearch {
  int binarySearch(int array[], int left, int right, int number) {
    if (right >= left) {
      int mid = left + (right - left) / 2;
      if (array[mid] == number)
        return mid;
      if (array[mid] > number)
        return binarySearch(array, left, mid - 1, number);
      return binarySearch(array, mid + 1, right, number);
    }
    return -1;
  }

  public static void main(String args[]) {
    ImpBinarySearch impBinarySearch = new ImpBinarySearch();
    int array[] = {2, 3, 4, 10, 40};
    int size = array.length;
    int number = 10;
    int index = impBinarySearch.binarySearch(array, 0, size - 1, number);
    if (index == -1)
      System.out.println("Element not present");
    else
      System.out.println("Element found at index " + index);
  }
}