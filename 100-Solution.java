import java.util.*;
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        if(p==null && q==null){
            return true;
        }else if(p==null || q==null){
            return false;
        }
        if(p.val==q.val){
            queue1.add(p);
            queue2.add(q);
        }else{
            return false;
        }
        while(!queue1.isEmpty()){
            TreeNode temp1=queue1.poll();
            TreeNode temp2=queue2.poll();
            if(temp1.left!=null && temp2.left!=null){
                if(temp1.left.val==temp2.left.val){
                    queue1.add(temp1.left);
                    queue2.add(temp2.left);
                }else{
                    return false;
                }
            }else{
                if(temp1.left!=temp2.left){
                    return false;
                }
            }
            if(temp1.right!=null && temp2.right!=null){
                 if(temp1.right.val==temp2.right.val ){
                    queue1.add(temp1.right);
                    queue2.add(temp2.right);
                }else{
                    return false;
                }
            }else{
                if(temp1.right!=temp2.right){
                    return false;
                }
            }
        }
        return true;
    }
}