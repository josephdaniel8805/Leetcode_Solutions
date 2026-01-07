/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long max=0;
    public int maxProduct(TreeNode root) {
        long mod=1_000_000_007L;
        long total=findtotal(root);
        subtree(root,total);
        return (int)(max%mod);
    }
    public long findtotal(TreeNode root){
        if(root==null) return 0;
        return root.val+findtotal(root.left)+findtotal(root.right);
    }
    public long subtree(TreeNode node, long total){
        if (node == null) return 0;
        long left = subtree(node.left,total);
        long right = subtree(node.right,total);
        long subTreeSum = node.val + left + right;
        long product = subTreeSum * (total - subTreeSum);
        max = Math.max(max, product);
        return subTreeSum;
    }
}