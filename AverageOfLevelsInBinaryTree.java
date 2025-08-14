import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Deque<TreeNode> qu = new ArrayDeque<>();

        qu.offerLast(root);

        while (!qu.isEmpty()) {
            int size = qu.size();
            double sum = 0.0d;
            for (int i = 0; i < size; i++) {
                TreeNode node = qu.pollFirst();
                sum += node.val;
                if (node.left != null) {
                    qu.offerLast(node.left);
                }
                if (node.right != null)
                    qu.offerLast(node.right);

            }
            result.add(sum / (double) size);
        }
        return result;

    }
}
