public class AddOneRowToTree {
	public TreeNode addOneRow(TreeNode root, int val, int depth) {
		if (depth == 1) {
			TreeNode newRoot = new TreeNode(val, root, null);
			root = newRoot;
			return root;

		}
		dfs(root, val, depth, 1);
		return root;
	}

	private void dfs(TreeNode root, int val, int depth, int i) {
		if (root == null)
			return;
		if (depth - 1 == i) {
			TreeNode left = root.left;
			TreeNode right = root.right;
			root.left = new TreeNode(val, left, null);
			root.right = new TreeNode(val, null, right);
			return;
		}
		dfs(root.left, val, depth, i + 1);
		dfs(root.right, val, depth, i + 1);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
