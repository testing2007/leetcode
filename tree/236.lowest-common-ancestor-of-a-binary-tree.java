// /*
// * @lc app=leetcode id=236 lang=java
// *
// * [236] Lowest Common Ancestor of a Binary Tree
// */

// // @lc code=start
// /**
// * Definition for a binary tree node.
// * public class TreeNode {
// * int val;
// * TreeNode left;
// * TreeNode right;
// * TreeNode(int x) { val = x; }
// * }
// */
// package tree;

// import java.util.ArrayList;
// import java.util.List;

// class Solution {
// public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
// List<List<TreeNode>> paths = searchPathToPQ(root, p, q);
// System.out.println("paths=" + paths);
// if (paths.size() == 2 && paths.get(0).size() > 0 && paths.get(1).size() > 0)
// {
// int prev = 0;
// int i = 0;

// List<TreeNode> pPath = paths.get(0);
// List<TreeNode> qPath = paths.get(1);
// while (i < pPath.size() && i < qPath.size() && pPath.get(i) == qPath.get(i))
// {
// prev = i;
// i++;
// }
// return pPath.get(prev);
// } else {
// return null;
// }
// //
// }

// List<List<TreeNode>> searchPathToPQ(TreeNode root, TreeNode p, TreeNode q) {
// List<List<TreeNode>> paths = new ArrayList<>();
// search(root, paths, new ArrayList<>(), p, q);
// return paths;
// }

// void search(TreeNode node, List<List<TreeNode>> paths, List<TreeNode> path,
// TreeNode p,
// TreeNode q) {
// if (node != null) {
// path.add(new TreeNode(node.val));
// if (node.val == p.val) {
// List<TreeNode> tempPath = new ArrayList<TreeNode>();
// for (TreeNode treeNode : path) {
// tempPath.add(new TreeNode(treeNode.val));
// }
// paths.add(tempPath);
// //
// } else if (node.val == q.val) {
// List<TreeNode> tempPath = new ArrayList<TreeNode>();
// for (TreeNode treeNode : path) {
// tempPath.add(new TreeNode(treeNode.val));
// }
// paths.add(tempPath);
// return;
// }
// }
// if (node.left == null && node.right == null) {
// path.clear();
// return;
// }

// if (node.left != null) {
// search(node.left, paths, path, p, q);
// }
// if (node.right != null) {
// search(node.right, paths, path, p, q);
// }
// }

// // TreeNode createTree(Integer[] ary) {
// // if (ary == null || ary.length == 0) {
// // return null;
// // }
// // TreeNode headerNode = _doCreateTree(null, ary, 0);
// // return headerNode;
// // }

// // TreeNode _doCreateTree(TreeNode headerNode, Integer[] ary, int index) {
// // if (index >= ary.length) {
// // return null;
// // }
// // if (ary[index] == null) {
// // return null;
// // }
// // TreeNode node = new TreeNode(ary[index]);
// // if (index == 0) {
// // headerNode = node;
// // }
// // node.left = _doCreateTree(headerNode, ary, ++index);
// // node.right = _doCreateTree(headerNode, ary, ++index);
// // return index == 0 ? headerNode : node;
// // }
// }

// // class Main {

// // public static void main(String[] args) {
// // Solution1 so = new Solution1();

// // // , 6, 2, 0, 8, null, null, 7, 4
// // Integer[] array = { 3, 5 };
// // TreeNode root = so.createTree(array);
// // TreeNode p = new TreeNode(3);
// // TreeNode q = new TreeNode(5);
// // TreeNode target = so.lowestCommonAncestor(root, p, q);
// // System.out.println("target=" + target.val);
// // }
// // }
// // @lc code=end
