package muxin.muzi.datastructure.middle.tree;

/**
 * @Author: smallming
 * @Date: 2021/10/14 5:37 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的中序遍历
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 *
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：root = [1]
 * 输出：[1]
 * 示例 4：
 *
 *
 * 输入：root = [1,2]
 * 输出：[2,1]
 * 示例 5：
 *
 *
 * 输入：root = [1,null,2]
 * 输出：[1,2]
 *  
 *
 * 提示：
 *
 * 树中节点数目在范围 [0, 100] 内
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xv7pir/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class InorderTraversal {
    //递归
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return list;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if(root == null){
            return ;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }


    //非递归
    public List<Integer> inorderTraversalTwo(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root !=null || !stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
           root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}
