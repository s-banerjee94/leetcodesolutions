public class KthSmallestElementInABST {
    private int kth = 0;
    private int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode root, int k) {
        if (root == null)
            return;

        inorder(root.left, k);
        if (++kth == k) {
            result = root.val;
            return;
        }

        inorder(root.right, k);
    }
}
