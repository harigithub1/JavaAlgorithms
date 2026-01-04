import java.util.*;

class E1TwoSumMultiplePairs {

    public static List<int[]> twoSumAll(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (map.containsKey(complement)) {
                result.add(new int[]{map.get(complement), i});
            }

            map.put(numbers[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 2,3};
        int target = 5;

        List<int[]> result = twoSumAll(numbers, target);
        for (int[] pair : result) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}