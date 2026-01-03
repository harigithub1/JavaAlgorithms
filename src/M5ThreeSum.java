import java.util.*;

public class M5ThreeSum {
    
    public static List<List<Integer>> threeSum(int[] nums, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Step 1: Sort the array
        
        // Step 2: Fix one number and use two pointers to find the other two
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for 'i'
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                
                if (currentSum == targetSum) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } 
                else if (currentSum < targetSum) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int targetSum = 0;  // You can change this value
        
        List<List<Integer>> triplets = threeSum(nums, targetSum);
        
        System.out.println("Triplets that sum to " + targetSum + ": " + triplets);
    }
}
