package Level2;

// https://www.geeksforgeeks.org/binary-search/
class ImpBinarySearch {
    int binarySearch(int arr[], int left, int right, int x)
    {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);
            return binarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }
    public static void main(String args[])
    {
        ImpBinarySearch ob = new ImpBinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int size = arr.length;
        int x = 10;
        int index = ob.binarySearch(arr, 0, size - 1, x);
        if (index == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + index);
    }
}