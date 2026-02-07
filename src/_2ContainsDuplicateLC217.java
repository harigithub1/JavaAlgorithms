import java.util.HashSet;
import java.util.Set;

public class _2ContainsDuplicateLC217 {
    public static boolean containsDuplicate(int[] numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1};
        System.out.println(containsDuplicate(numbers));
    }
}
/**
 * You can describe this as:
 *
 * 🟢 “HashSet Lookup Pattern”
 * 🟢 “Seen Before Pattern”
 * 🟢 “Duplicate Detection Using Set”
 */
/**
 * //set.add(num) will add num to the set and returns true if num is not present already
 */