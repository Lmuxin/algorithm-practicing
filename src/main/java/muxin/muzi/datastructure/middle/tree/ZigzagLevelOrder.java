package muxin.muzi.datastructure.middle.tree;

/**
 * @Author: smallming
 * @Date: 2021/10/14 6:19 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.*;

/**
 * 二叉树的锯齿形层次遍历
 * 给定一个二叉树，返回其节点值的锯齿形层序遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回锯齿形层序遍历如下：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvle7s/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()){
            int length = deque.size();
            List<Integer> temp = new ArrayList<>();
            for(int i =0;i<length;i++){
                TreeNode pop = deque.pop();
                temp.add(pop.val);
                if(pop.left!=null){
                    deque.add(pop.left);
                }
                if(pop.right!=null){
                    deque.add(pop.right);
                }
            }
            res.add(temp);
        }

        for(int i =0;i<res.size();i++){
            if((i+1)%2==0){
                List<Integer> integers = res.get(i);
                Collections.reverse(integers);
                res.set(i,integers);
            }
        }
        return res;
    }
}
