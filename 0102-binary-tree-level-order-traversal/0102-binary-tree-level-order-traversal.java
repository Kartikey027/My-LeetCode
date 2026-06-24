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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return a;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> r=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode f=q.poll();
                r.add(f.val);
                if(f.left!=null) q.add(f.left);
                if(f.right!=null) q.add(f.right);
            }
            a.add(r);
        }
        return a;
    }
}