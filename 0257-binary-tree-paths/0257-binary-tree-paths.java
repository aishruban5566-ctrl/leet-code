import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v) { val = v; }
}
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        dfs(root, "", res);
        return res;
    }
    private void dfs(TreeNode node, String path, List<String> res) {
        if (node == null) return;
        path += node.val;
        if (node.left == null && node.right == null) {
            res.add(path);
            return;
        }
        dfs(node.left, path + "->", res);
        dfs(node.right, path + "->", res);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        System.out.println(sol.binaryTreePaths(root)); 
        TreeNode root2 = new TreeNode(1);
        System.out.println(sol.binaryTreePaths(root2)); 
    }
}