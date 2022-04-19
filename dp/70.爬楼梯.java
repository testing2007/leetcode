package dp;
/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
  // 递归实现，会超出时间限制
  // public int climbStairs(int n) {
  // int nums = 0;
  // if (n == 0 || n == 1) {
  // nums = 1;
  // } else {
  // nums += climbStairs(n - 1) + climbStairs(n - 2);
  // }
  // return nums;
  // }

  // 利用滚动数组思想
  public int climbStairs(int n) {
    int p = 0, q = 0, r = 1;
    for (int i = 1; i <= n; ++i) {
      p = q;
      q = r;
      r = p + q;
    }
    return r;
  }
  //
}

class Main {
  public static void main(String[] args) {
    Solution s = new Solution();
    int n = 4;
    int nums = s.climbStairs(n);
    System.out.println("nums=" + nums);
  }
}
// @lc code=end
