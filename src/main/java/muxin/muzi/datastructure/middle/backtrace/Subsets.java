package muxin.muzi.datastructure.middle.backtrace;

/**
 * @Author: smallming
 * @Date: 2021/10/15 3:31 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 子集
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 示例 2：
 *
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * nums 中的所有元素 互不相同
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xv67o6/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new LinkedList<>();
        backtrace(nums,0,path,res);
        return res;

    }

    private void backtrace(int[] nums, int begin, Deque<Integer> path, List<List<Integer>> res) {
        res.add(new ArrayList<>(path));
        for(int i=begin;i<nums.length;i++){
            path.addLast(nums[i]);
            backtrace(nums,i+1,path,res);
            path.removeLast();
        }

    }
}
