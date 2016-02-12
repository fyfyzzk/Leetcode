/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        int leftHeight = 0;
        int rightHeight = 0;
        boolean result = false;
        
        if (null == root){
            return true;
        }
        else{
            leftHeight = getHeight(root.left);
            rightHeight = getHeight(root.right);
        }
        
        if (leftHeight - rightHeight == 0 || leftHeight - rightHeight == 1 || leftHeight - rightHeight == -1){
            result = true;
        }
        
        return result;
    }
    
    private int getHeight(TreeNode root)
    {
        int height = 0;
        int leftHeight = 0;
        int rightHeight =0;
        
        if (null == root){
            return 0;
        }
        else{
            height++;
            
            if (null != root.left){
                leftHeight = getHeight(root.left);
            }
            
            if (null != root.right){
                rightHeight = getHeight(root.right);
            }
        }
        height += (leftHeight>rightHeight) ? leftHeight : rightHeight;
        
        return height;
    }
}
