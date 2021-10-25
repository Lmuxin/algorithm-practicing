package datastructure.middle.backtrace;

/**
 * @Author: smallming
 * @Date: 2021/10/15 3:22 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 示例 2：
 *
 * 输入：nums = [0,1]
 * 输出：[[0,1],[1,0]]
 * 示例 3：
 *
 * 输入：nums = [1]
 * 输出：[[1]]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * nums 中的所有整数 互不相同
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvqup5/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new LinkedList<>();
        boolean[] used = new boolean[nums.length];
        backtrace(nums,used,res,path);
        return res;
    }

    private void backtrace(int[] nums, boolean[] used, List<List<Integer>> res, Deque<Integer> path) {
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0  ; i<nums.length;i++){
            if(used[i]){
                continue;
            }

            used[i] = true;
            path.addLast(nums[i]);
            backtrace(nums,used,res,path);
            path.removeLast();
            used[i]=false;
        }
    }
}
