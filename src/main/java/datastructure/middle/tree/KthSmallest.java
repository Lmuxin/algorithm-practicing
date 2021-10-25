package datastructure.middle.tree;

/**
 * @Author: smallming
 * @Date: 2021/10/14 7:27 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.Stack;

/**
 * 二叉搜索树中第K小的元素
 * 给定一个二叉搜索树的根节点 root ，和一个整数 k ，请你设计一个算法查找其中第 k 个最小元素（从 1 开始计数）。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [3,1,4,null,2], k = 1
 * 输出：1
 * 示例 2：
 *
 *
 * 输入：root = [5,3,6,2,4,null,null,1], k = 3
 * 输出：3
 *  
 *
 *  
 *
 * 提示：
 *
 * 树中的节点数为 n 。
 * 1 <= k <= n <= 104
 * 0 <= Node.val <= 104
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvuyv3/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class KthSmallest {
    public int kthSmallest(TreeNode root, int k) {
        //中序遍历正好是由小到大排列，当标记值与k相同时返回即可
        int mark =1;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root !=null){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }else {
                root = stack.pop();
                if(k==mark){
                    return root.val;
                }else {
                    mark++;
                }
                root = root.right;
            }
        }
        return 0;
    }
}
