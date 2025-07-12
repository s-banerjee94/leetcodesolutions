public class SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		return dfs(root, root);
	}

	private int dfs(TreeNode current, TreeNode root) {
		if (current == null)
			return 0;
		if (current.left == null && current.right == null &&  (root != null && root.left == current)) {
				return current.val;
			
		}
		int right = dfs(current.right, current);
		int left = dfs(current.left, current);
		return left + right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
