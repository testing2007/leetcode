package tree;
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
 */

// @lc code=start
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> strList =  new ArrayList<>();
        search(root, strList, "");
        return strList;
    }

    private void search(TreeNode node, List<String>strList, String str) {
        if(node != null)  {
          if(str == "") {
            str += node.val;
          } else {
            str += "->" + node.val;
          }
        }
        if(node != null && (node.left==null && node.right==null)) {
            strList.add(str);
            str = "";
            return ;
        }
        if(node.left != null) {
            search(node.left, strList, str);
        }
        if(node.right != null) {
            search(node.right, strList, str);
        }
    }
}
// @lc code=end

