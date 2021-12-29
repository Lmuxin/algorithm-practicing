package muxin.muzi.datastructure.middle.tree;

/**
 * @Author: smallming
 * @Date: 2021/10/14 7:07 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 从前序与中序遍历序列构造二叉树
 * 给定一棵树的前序遍历 preorder 与中序遍历  inorder。请构造二叉树并返回其根节点。
 *
 *  
 *
 * 示例 1:
 *
 *
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 * 示例 2:
 *
 * Input: preorder = [-1], inorder = [-1]
 * Output: [-1]
 *  
 *
 * 提示:
 *
 * 1 <= preorder.length <= 3000
 * inorder.length == preorder.length
 * -3000 <= preorder[i], inorder[i] <= 3000
 * preorder 和 inorder 均无重复元素
 * inorder 均出现在 preorder
 * preorder 保证为二叉树的前序遍历序列
 * inorder 保证为二叉树的中序遍历序列
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvix0d/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class BuildTree {
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //递归思路：为方便查找结点的值，先建立结点值和结点中序索引的map，然后开始建立根结点，然后递归地建立左子树和右子树，关键在于确定子树大小进而确定递归边界。
        for(int i = 0 ;i<preorder.length;i++){
            map.put(inorder[i],i);
        }
        return inAndMid(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private TreeNode inAndMid(int[] preorder, int pre_left, int pre_right, int[] inorder, int in_left, int in_right) {
        if(pre_left>pre_right){
            return null;
        }
        int pre_root = preorder[pre_left];
        int in_root = map.get(pre_root);
        int left_size = in_root - in_left;
        TreeNode root = new TreeNode(pre_root);
        root.left = inAndMid(preorder, pre_left+1, pre_left+left_size, inorder, in_left, in_root-1);
        //建立右子树
        root.right = inAndMid(preorder, pre_left+left_size+1, pre_right, inorder, in_root+1, in_right);
        return root;
    }
}
