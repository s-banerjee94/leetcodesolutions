import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            List<Integer> level = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    level.add(1);
                } else {
                    int sum = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                    level.add(sum);
                }
            }
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {
        PascalsTriangle solution = new PascalsTriangle();
        List<List<Integer>> triangle = solution.generate(5);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

}
