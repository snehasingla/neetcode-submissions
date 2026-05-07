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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ls= new ArrayList<>();
        helper(root, ls, 0);
        return ls;
    }

    public void helper(TreeNode root, List<Integer> ls, int depth){
        if(root==null) return;
        if(ls.size() == depth) ls.add(root.val);
        helper(root.right, ls, depth+1);
        helper(root.left, ls, depth+1);
    }

}
