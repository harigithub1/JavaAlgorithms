import java.util.HashMap;
import java.util.Map;

public class _1TwoSumLC1 {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (indexMap.containsKey(complement)) {
                return new int[]{indexMap.get(complement), i};
            }
            indexMap.put(numbers[i], i);
        }
        throw new IllegalArgumentException("No two numbers sum to target: " + target);
    }

    public static void main(String[] args) {
        int[] numbers = {7, 2, 11, 15};
        int target = 18;
        int[] result = twoSum(numbers, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
/**
 * Notes:
 * LeetCode#1
 * Technique: Hashing (here it happens - map.containsKey(complement) means using hashing technique)
 * Pattern: One-pass HashMap / Complement Map
 * Category: Space–Time Tradeoff
 */

//we should not implement twoSum using containsValue, because its O(n2) since it involves loops

/*
 * Design choice:
 * If multiple valid pairs exist, this method returns
 * the first pair found while scanning from left to right.
 */

/**
 *below is a better way since it has only one hashing
 *if map.containsKey(complement) is used two hashing happens
 *checking if complement is present and then returning indices (only one hashing)
 * Integer index = map.get(complement);
 * if (index != null) {
 * return new int[] {index, i};
 * }
 * map.put(nums[i], i);
 */