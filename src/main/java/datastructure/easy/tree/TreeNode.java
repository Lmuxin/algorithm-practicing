package datastructure.easy.tree;

/**
 * @Author: smallming
 * @Date: 2021/10/11/7:37 下午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
