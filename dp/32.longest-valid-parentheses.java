package dp;
/*
 * @lc app=leetcode id=32 lang=java
 *
 * [32] Longest Valid Parentheses
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.lang.Character;

// @lc code=start
class Solution {
  public int longestValidParentheses(String s) {
    Integer inputLength = s.length();
    if (s == null || inputLength <= 0) {
      return 0;
    }
    // ((()))
    // (()())
    // (()(())

    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < inputLength; i++) {
      list.add(i, 0);
    }
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < inputLength; i++) {
      Character c = s.charAt(i);
      if (c == ')') {
        if (stack.empty()) {
          stack.push(i);
        } else {
          stack.pop();
        }
        // if(stack.lastElement()=='(') {
        // //栈顶元素为 (, 出栈
        // } else {
        // //入栈
        // }
      } else {
        stack.push(i);
      }
    }

    while (!stack.empty()) {
      Integer index = stack.pop();
      list.set(index, 1);
    }

    Integer maxLength = 0;
    Integer length = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == 0) {
        length += 1;
      } else {
        maxLength = maxLength < length ? length : maxLength;
        length = 0;
      }
    }
    maxLength = maxLength < length ? length : maxLength;

    return maxLength;
  }
}

// class Main {
// public static void main(String[] args) {
// Solution32 so = new Solution32();
// int n = so.longestValidParentheses(")(()(()))");
// System.out.println("result n=" + n);
// }
// }
// @lc code=end
