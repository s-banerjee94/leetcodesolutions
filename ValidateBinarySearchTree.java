public class ValidateBinarySearchTree {
    private TreeNode previousVal = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;

        if (!isValidBST(root.left))
            return false;
        if (previousVal != null && previousVal.val >= root.val)
            return false;
        previousVal = root;

        return isValidBST(root.right);
    }
}
