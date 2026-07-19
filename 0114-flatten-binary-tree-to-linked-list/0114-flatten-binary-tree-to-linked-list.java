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
    public void flatten(TreeNode root) {
        if(root == null)    return;
        List<TreeNode> list = new ArrayList<>();
        listing(root, list);
        for(int i = 0; i < list.size() - 1; i++)
        {
            list.get(i).left = null;
            list.get(i).right = list.get(i + 1);
        }
        TreeNode last = list.get(list.size() - 1);
        last.left = null;
        last.right = null;
    }
    private void listing(TreeNode root, List<TreeNode> list)
    {
        if(root == null)    return;
        list.add(root);
        listing(root.left, list);
        listing(root.right, list);
    }
}