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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum=0,max=Integer.MIN_VALUE,ans=0,count=0;
        while(!q.isEmpty()){
            sum=0;
            int size=q.size();
            for(int ind=0;ind<size;ind++){
                TreeNode qpe=q.poll();
                if(qpe.right!=null){
                    q.add(qpe.right);
                }
                if(qpe.left!=null){
                    q.add(qpe.left);
                }
                sum+=qpe.val;
            }
            count++;
            if(sum>max){
                max=sum;
                ans=count;
            }
        }
        return ans;
    }
}
