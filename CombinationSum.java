import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, target, candidates, result, new ArrayList<>());
        return result;
    }

    private void backtrack(int start, int target, int[] candidates, List<List<Integer>> result, List<Integer> path) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        if (target < 0)
            return;

        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            backtrack(i, target - candidates[i], candidates, result, path);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum solution = new CombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> combinations = solution.combinationSum(candidates, target);

        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
