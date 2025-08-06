public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root) {
        if (root == null) return 0;

        int left = checkHeight(root.left);
        if (left == -1) return -1;

        int right = checkHeight(root.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        BalancedBinaryTree btc = new BalancedBinaryTree();
        boolean result = btc.isBalanced(root);

        System.out.println("Is the tree balanced? " + result);
    }
}
