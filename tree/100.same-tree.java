package tree;

/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
 */

// @lc code=start
//**
//  Definition for a binary tree node.

 //*/
class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q == null) {
          return true;
        } else if(p==null || q==null) {
          return false;
        }

        if(p.val == q.val) {
          boolean isSameLeft = this.isSameTree(p.left, q.left);
          if(isSameLeft){
            boolean isSameRight = this.isSameTree(p.right, q.right);
            return isSameRight;
          } else {
            return false;
          }
        } else {
          return false;
        }
    }
}

// @lc code=end

