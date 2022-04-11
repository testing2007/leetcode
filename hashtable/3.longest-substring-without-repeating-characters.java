package hashtable;
/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
      // "bbbb"
      // "abcda" => abcd bcda
      // "abcdab" => abcd bcda cdab
      // "pwwkew"
      List<String> options = new ArrayList<String>();
      Map<Character, Integer> curAreaMap = new HashMap<Character, Integer>();
      String curOptionStr = "";
      for (int i = 0; i < s.length(); i++) {
        Character curChar = new Character(s.charAt(i));
        if(curAreaMap.containsKey( curChar.charValue() )){
          int prevIndex = curAreaMap.get(curChar.charValue());
          options.add(curOptionStr);
          // curOptionStr += curChar;
          curOptionStr = s.substring(prevIndex+1, i+1);
          
          //删除前一段的集合
          Set<Character> prevGroups = curAreaMap.keySet();
          List<Character> removePrevGroupKeys = new ArrayList<>();
          for (Character prevGroup : prevGroups) {
            if(curAreaMap.get(prevGroup)<=prevIndex) {
              removePrevGroupKeys.add(prevGroup);
              
            }
          }
          for (Character character : removePrevGroupKeys) {
            curAreaMap.remove(character);
          }
        } else {
          curOptionStr += curChar;
        }
        curAreaMap.put(curChar, i);

        if(i==s.length()-1) {
          options.add(curOptionStr);
        }
      }

      int maxLength = 0;
      String maxStr = "";
      for (String optionStr : options) {
        int curOptionsLength = optionStr.length();
        if(curOptionsLength > maxLength){
          maxLength = curOptionsLength;
          maxStr = optionStr;
        }
      }
      if(maxLength>0){
        System.out.println("maxStr="+maxStr);
      }
      return maxLength;
    }

    private void values() {
    }
}

// class Main3 {
//   public static void main(String[] args) {
//     Solution3 so = new Solution3();
//     int n = so.lengthOfLongestSubstring("pwwkew"); //abcabcbb
//     System.out.println("result n="+n);
//   }
// }
// @lc code=end

