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
import java.util.*;

class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
            int size=q.size();
            sum=0;
            for(int ind=0;ind<size;ind++){
                TreeNode n=q.poll();
                if(n.right!=null){
                    q.add(n.right);
                }
                if(n.left!=null){
                    q.add(n.left);
                }
                sum+=n.val;
            }    
        }
        return sum;
    }
}