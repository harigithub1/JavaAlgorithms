public class E3MoveZeroes {
    //Two-Pointer Technique, O(n) time, O(1) space
    public static void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }

        // Fill remaining elements with 0
        while (lastNonZeroIndex < nums.length) {
            nums[lastNonZeroIndex] = 0;
            lastNonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
