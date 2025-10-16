import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null)
            return result;

        dfs(root, "", result);

        return result;
    }

    private void dfs(TreeNode root, String sb, List<String> result) {
        if (root == null)
            return;

        sb += root.val;

        if (root.left == null && root.right == null) {
            result.add(sb);
            return;
        }

        dfs(root.left, sb + "->", result);
        dfs(root.right, sb + "->", result);

    }

    public static void main(String[] args) {
        // Example usage:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        BinaryTreePaths btp = new BinaryTreePaths();
        List<String> paths = btp.binaryTreePaths(root);
        for (String path : paths) {
            System.out.println(path);
        }
    }

}
