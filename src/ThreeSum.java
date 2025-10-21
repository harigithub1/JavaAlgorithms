import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Step 1: Sort array

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == targetSum) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < targetSum) {
                    left++;  // Need bigger sum
                } else {
                    right--; // Need smaller sum
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int targetSum = 0; // You can change this to any target value

        List<List<Integer>> triplets = threeSum(nums, targetSum);

        System.out.println("All unique triplets with sum = " + targetSum + ":");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
