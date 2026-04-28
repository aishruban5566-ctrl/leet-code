class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v) { val = v; }
}
public class Solution {
    private int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxDiameter;
    }
    private int depth(TreeNode node) {
        if (node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return 1 + Math.max(left, right);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(sol.diameterOfBinaryTree(root)); 
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        System.out.println(sol.diameterOfBinaryTree(root2)); 
    }
}