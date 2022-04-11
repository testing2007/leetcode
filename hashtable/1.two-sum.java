package hashtable;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution1 {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int j = 0; j < nums.length; j++) {
      int key = target - nums[j];
      if (map.containsKey(nums[j])) {
        int[] ret = new int[2];
        ret[0] = map.get(nums[j]);
        ret[1] = j;
        return ret;
      }
      map.put(key, j);
    }
    return null;
  }

}

class Main {
  public static void main(String[] args) {
    Solution1 so = new Solution1();
    int[] nums = { -1, -2, -3, -4 };
    int[] ret = so.twoSum(nums, -6);
    if (ret!=null && ret.length == 2) {
      System.out.println("ret[0]=" + ret[0] + ",ret[1]=" + ret[1]);
    }
  }
}
// @lc code=end
