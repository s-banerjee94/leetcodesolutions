import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        boolean flag = true;
        Deque<TreeNode> qu = new ArrayDeque<>();
        qu.offerLast(root);

        while (!qu.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = qu.size();
            flag = !flag;

            for (int i = 0; i < size; i++) {
                TreeNode node = qu.pollFirst();
                if (flag) {
                    level.add(0, node.val);
                } else {
                    level.add(node.val);
                }

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
