//112 Path Sum
class Solution {
    public static boolean dfs(TreeNode root,int targetSum, int sum){
        if(root == null){
            return false; 
        }
        if(root.left == null && root.right == null){
            return targetSum == sum+root.val;
        }

        return (dfs(root.left,targetSum,sum+root.val) || dfs(root.right,targetSum,sum+root.val));
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return dfs(root, targetSum,0);
    }
}
