public class SmallestStringStartingFromLeaf {
	private String result;

	public String smallestFromLeaf(TreeNode root) {
		result = "";
		dfs(root, new StringBuilder());
		return result;
	}

	private void dfs(TreeNode root, StringBuilder stringBuilder) {
		if (root == null)
			return;
		stringBuilder.insert(0, (char) (root.val + 'a'));
		if (root.left == null && root.right == null) {
			if ("".equals(result))
				result = stringBuilder.toString();
			else
				result = result.compareTo(stringBuilder.toString()) > 0 ? stringBuilder.toString() : result;
		}
		dfs(root.left, stringBuilder);
		dfs(root.right, stringBuilder);
		stringBuilder.deleteCharAt(0);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(25);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);

		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);

		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(2);

		System.out.println(new SmallestStringStartingFromLeaf().smallestFromLeaf(root));
	}

}
