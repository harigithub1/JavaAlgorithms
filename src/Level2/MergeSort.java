package Level2;

// Merge Sort https://www.youtube.com/watch?v=yv6svAfoYik
// In merge sort we don't change the original array, we just add original array elements to the new array in ascending/descending order.
// Where as in bubble/insertion etc., we swap the elements of original array using temporary variable
class MergeSort {
  //sort method
  private static int[] sort(int[] array) {
    if (array.length <= 1) //base case of recursive method
      return array;
    int midpoint = array.length / 2;
    int[] left = new int[midpoint]; //declaring left side of the array
    int[] right = new int[array.length - midpoint]; //declaring right side of the array
    for (int i = 0; i < midpoint; i++)
      left[i] = array[i]; // loading left half of elements of the array to this new array
    for (int j = 0; j < right.length; j++)
      right[j] = array[midpoint + j]; // loading right half of elements of the array to this new array
    int[] mergedResult; //declare new array to hold sorted array elements
    left = sort(left);  // recursive call to sort method
    right = sort(right);
    mergedResult = merge(left, right);
    return mergedResult;
  }

  //merge method
  private static int[] merge(int[] left, int[] right) { //it's going to merge left and right arrays
    int[] result = new int[left.length + right.length];
    int leftPointer, rightPointer, resultPointer;  //these variables are indexes of left array, right array and result array.
    leftPointer = rightPointer = resultPointer = 0;
    while (leftPointer < left.length || rightPointer < right.length) { // while there are elements in either of the arrays
      if (leftPointer < left.length && rightPointer < right.length) { // if there are elements in both left and right arrays
        if (left[leftPointer] < right[rightPointer]) {
          result[resultPointer] = left[leftPointer];
          resultPointer++;
          leftPointer++;
        } else {
          result[resultPointer] = right[rightPointer]; // initial iteration : here adding 3 to result[0]
          resultPointer++;
          rightPointer++;
        }
      } else if (leftPointer < left.length) {
        //if all the right side elements are added to result then add remaining left elements to the result array
        // initial iteration: for example here after adding 3 to result it comes here and adds 4 to result[1]
        result[resultPointer] = left[leftPointer];
        resultPointer++;
        leftPointer++;
      } else if (rightPointer < right.length) {
        //if all the left side elements are added to the result then add remaining right elements to the result array
        result[resultPointer] = right[rightPointer];
        resultPointer++;
        rightPointer++;
      }
    }
    return result;
  }

  public static void main(String args[]) {
    int[] array = {4, 2, 3, 1};
    int[] sortedArray;
    sortedArray = sort(array);
    System.out.println("unsorted");
    for (int i : array)
      System.out.print(i + " ");
    System.out.println();
    System.out.println("sorted");
    for (int i : sortedArray)
      System.out.print(i + " ");
  }
}