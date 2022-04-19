package dp;
/*
 * @lc app=leetcode.cn id=64 lang=java
 *
 * [64] 最小路径和
 */

// @lc code=start
class Solution {
  public int minPathSum(int[][] grid) {
    if (grid == null || grid.length <= 0 || grid[0].length <= 0) {
      return 0;
    }
    int rows = grid.length;
    int columns = grid[0].length;
    int dp[][] = new int[rows][columns];
    dp[0][0] = grid[0][0];
    for (int i = 1; i < rows; ++i) {
      dp[i][0] = dp[i - 1][0] + grid[i][0];
    }

    for (int j = 1; j < columns; ++j) {
      dp[0][j] = dp[0][j - 1] + grid[0][j];
    }

    for (int i = 1; i < rows; i++) {
      for (int j = 1; j < columns; j++) {
        dp[i][j] = (dp[i - 1][j] > dp[i][j - 1] ? dp[i][j - 1] : dp[i - 1][j]) + grid[i][j];
      }
    }
    return dp[rows - 1][columns - 1];
  }
}

// class Main64 {
// public static void main(String[] args) {
// Solution64 s = new Solution64();
// int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
// int minPathSum = s.minPathSum(grid);
// System.out.println("minPathSum=" + minPathSum);
// }
// }
// @lc code=end
