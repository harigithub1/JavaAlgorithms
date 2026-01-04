// leetcode 1
import java.util.HashMap;
import java.util.Map;

public class E1TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            //checking if complement is present ant then returning indices (only one hashing)
            Integer index = map.get(complement);
            if (index != null) {
                return new int[] {index, i};
            }
            map.put(nums[i], i);

//            //checking if complement is present ant then returning indices (two hasings)
//            if (map.containsKey(complement)) {
//                return new int[]{map.get(complement), i};
//            }
//            map.put(numbers[i], i);
        }

        throw new IllegalArgumentException("No two numbers sum to target: " + target);
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}