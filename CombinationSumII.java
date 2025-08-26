import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, target, candidates, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int target, int[] candidates, List<Integer> path, List<List<Integer>> result) {
        if (target == 0 && !result.contains(path)) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1])
                continue;
            if (target < candidates[i])
                return;
            path.add(candidates[i]);
            backtrack(i + 1, target - candidates[i], candidates, path, result);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSumII solution = new CombinationSumII();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> combinations = solution.combinationSum2(candidates, target);

        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
