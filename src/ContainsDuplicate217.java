import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) { //set.add(num) will add num to the set and returns true if num is not present already
                return true; // duplicate found
            }
        }
        return false; // no duplicates
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums)); // true
    }
}
