package dp;
/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution509 {
  public int fib(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    int res = 0;
    int p = 0;
    int q = 1;
    for (int i = 2; i <= n; i++) {
      res = p + q;
      p = q;
      q = res;
    }
    return res;
  }
}

// class Main509 {
// public static void main(String[] args) {
// Solution509 s = new Solution509();
// int n = 2;
// int res = s.fib(n);
// System.out.println("res=" + res);
// }
// }
// @lc code=end