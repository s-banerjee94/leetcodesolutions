import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int num : nums) {
            if (temp.contains(num))
                continue;
            temp.add(num);
            backtrack(nums, result, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Permutations solution = new Permutations();
        int[] nums = {1, 2, 2};
        List<List<Integer>> permutations = solution.permute(nums);

        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }
}
