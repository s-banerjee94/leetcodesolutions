import java.util.ArrayList;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        int smaller = 0;
        int larger = 0;

        for (int i : nums) {
            if (i < target)
                smaller++;
            if (i > target)
                larger++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length - (smaller + larger); i++) {
            result.add(smaller + i);
        }
        return result;
    }


    public static void main(String[] args) {
        FindTargetIndicesAfterSortingArray solution = new FindTargetIndicesAfterSortingArray();
        int[] nums = {1, 2, 5, 2, 3};
        int target = 3;
        List<Integer> result = solution.targetIndices(nums, target);
        System.out.println("Target Indices: " + result);
    }
}

