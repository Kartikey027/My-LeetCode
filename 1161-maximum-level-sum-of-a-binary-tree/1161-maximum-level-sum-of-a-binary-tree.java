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
    public int maxLevelSum(TreeNode root) {
        int max=Integer.MIN_VALUE;
        int level=0,maxLevel=0;
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        while(!q.isEmpty()){
            int sum=0;
            int size=q.size();
            level++;
            for(int i=0;i<size;i++){
                TreeNode t=q.poll();
                sum+=t.val;
                if(t.right!=null) q.add(t.right);
                if(t.left!=null) q.add(t.left);
            }
            if(max<sum){
                maxLevel=level;
                max=sum;
            }
        }
        return maxLevel;
    }
}