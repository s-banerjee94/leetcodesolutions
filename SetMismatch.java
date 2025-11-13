import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int sum = 0;
        int duplicate = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i))
                duplicate = i;
            else
                sum += i;
        }
        int missing = ((nums.length * (nums.length + 1)) / 2) - sum;
        return new int[] { duplicate, missing };
    }
}
