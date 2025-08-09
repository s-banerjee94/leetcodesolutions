import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Deque<TreeNode> qu = new ArrayDeque<>();
        qu.offerLast(root);

        while (!qu.isEmpty()) {

            int size = qu.size() - 1;
            for (int i = 0; i <= size; i++) {
                TreeNode node = qu.pollFirst();
                if (i == size)
                    result.add(node.val);

                if (node.left != null)
                    qu.offerLast(node.left);

                if (node.right != null)
                    qu.offerLast(node.right);
            }
        }
        return result;
    }
}
