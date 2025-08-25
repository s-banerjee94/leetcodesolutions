import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(nums, result, used, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, boolean[] used, List<Integer> path) {
        if (path.size() == nums.length && !result.contains(path)) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;

            path.add(nums[i]);
            used[i] = true;

            backtrack(nums, result, used, path);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        PermutationsII solution = new PermutationsII();
        int[] nums = {1, 3, 2};
        List<List<Integer>> result = solution.permuteUnique(nums);

        System.out.println("Unique permutations for array " + Arrays.toString(nums) + ":");
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
