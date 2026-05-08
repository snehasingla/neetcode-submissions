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
    //int maxsum = Integer.MIN_VALUE; //with global variable
    public int maxPathSum(TreeNode root) {
        int[] maxval = new int[1];
        Arrays.fill(maxval, Integer.MIN_VALUE);
        dfs(root, maxval);
        return maxval[0];
    }

    public int dfs(TreeNode root, int[] maxsum){
        if(root==null) return 0;
        int left = Math.max(dfs(root.left , maxsum) , 0);
        int right = Math.max(dfs(root.right , maxsum) , 0);
        maxsum[0] = Math.max(maxsum[0] , left + right + root.val);
        return root.val + Math.max(left, right);
    }
}
