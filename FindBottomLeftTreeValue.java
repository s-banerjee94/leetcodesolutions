public class FindBottomLeftTreeValue {
    private int maxDepth = -1;
    private int leftVal = 0;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return leftVal;
    }

    private void dfs(TreeNode node, int depth) {
        if (node == null) return;

        if (depth > maxDepth) {
            maxDepth = depth;
            leftVal = node.val;
        }

        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
}
