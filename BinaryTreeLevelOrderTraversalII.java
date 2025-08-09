import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null)
            return result;

        Deque<TreeNode> qu = new ArrayDeque<>();
        qu.offerLast(root);

        while (!qu.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = qu.pollFirst();
                level.add(node.val);
                if (node.left != null)
                    qu.offerLast(node.left);

                if (node.right != null)
                    qu.offerLast(node.right);
            }
            result.addFirst(level);
        }
        return result;
    }
}
