// /*
// * @lc app=leetcode.cn id=121 lang=java
// *
// * [121] 买卖股票的最佳时机
// */

// // @lc code=start
// class Solution {
// public int maxProfit(int[] prices) {
// if (prices == null || prices.length < 2) {
// return 0;
// }
// int buyIn = 0;
// int buyOut = 0;
// for (int i = 1; i < prices.length; i++) {
// if (prices[buyIn] > prices[i]) {
// buyIn = i;
// }

// if (buyOut < buyIn) {
// buyOut = buyIn;
// }
// if (i > buyIn && prices[i] > prices[buyOut]) {
// buyOut = i;
// }

// }
// return buyOut - buyIn > 0 ? prices[buyOut] - prices[buyIn] : 0;
// }
// }

// class Main {
// public static void main(String[] args) {
// Solution so = new Solution();
// int[] nums = { 7, 1, 5, 3, 6, 4 };
// int profit = so.maxProfit(nums);
// System.out.println("ret[0]=" + profit);
// }
// }
// // @lc code=end
