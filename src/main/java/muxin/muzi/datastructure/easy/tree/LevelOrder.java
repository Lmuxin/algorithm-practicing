package muxin.muzi.datastructure.easy.tree;

/**
 * @Author: smallming
 * @Date: 2021/10/12/11:14 上午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 *  
 *
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层序遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnldjj/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int length = deque.size();
            for(int i =1;i<=length;i++){
                TreeNode pop = deque.pop();
                temp.add(pop.val);
                if(pop.left!=null){
                    deque.add(pop.left);
                }
                if(pop.right!=null){
                    deque.add(pop.right);
                }
            }
            result.add(temp);
        }
        return result;
    }
}
