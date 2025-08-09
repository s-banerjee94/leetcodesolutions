import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Deque<TreeNode> qu = new ArrayDeque<>();
        qu.offerLast(root);

        while (!qu.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = qu.pollFirst();
                level.add(node.val);
                if (node.left != null)
                    qu.offerLast(node.left);
                if (node.right != null)
                    qu.offerLast(node.right);
            }
            result.add(level);
        }
        return result;
    }
}
