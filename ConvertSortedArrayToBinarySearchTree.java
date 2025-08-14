public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return bTree(nums, 0, nums.length - 1);
    }

    private TreeNode bTree(int[] nums, int left, int right) {
        if (left > right)
            return null;

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = bTree(nums, left, mid - 1);
        node.right = bTree(nums, mid + 1, right);
        return node;
    }
}
