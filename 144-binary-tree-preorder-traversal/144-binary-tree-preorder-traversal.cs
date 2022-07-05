/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public IList<int> PreorderTraversal(TreeNode root) {
         IList<int> list1 = new List<int>();
        if(root == null) return list1;
        
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.Push(root);
        
        while(s.Count != 0) {
            TreeNode x = s.Pop();
            list1.Add(x.val);
            
            if(x.right != null) {
                s.Push(x.right);
            }
            if(x.left != null) {
                s.Push(x.left);
            }
        }
    
        
        
        return list1;
        
    }
}