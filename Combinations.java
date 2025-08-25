import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n, k, 1, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int n, int k, int start, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i <= n; i++) {
            path.add(i);
            backtrack(n, k, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        int n = 4;
        int k = 2;
        List<List<Integer>> result = combinations.combine(n, k);

        System.out.println("Combinations for n = " + n + ", k = " + k + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

}
