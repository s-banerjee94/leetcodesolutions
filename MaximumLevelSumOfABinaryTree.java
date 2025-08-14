import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumLevelSumOfABinaryTree {
    public int maxLevelSum(TreeNode root) {
        Deque<TreeNode> qu = new ArrayDeque<>();
        qu.offerLast(root);
        int maxSum = root.val;
        int level = 1;
        int currentLevel = 1;
        while (!qu.isEmpty()) {
            int currentLevelSum = 0;
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = qu.pollFirst();
                currentLevelSum += node.val;
                if (node.left != null)
                    qu.offerLast(node.left);

                if (node.right != null)
                    qu.offerLast(node.right);

            }
            if (currentLevelSum > maxSum) {
                maxSum = currentLevelSum;
                level = currentLevel;
            }
            currentLevel++;
        }
        return level;
    }
}
