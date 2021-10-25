package datastructure.middle.sortandsearch;

/**
 * @Author: smallming
 * @Date: 2021/10/15 4:39 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 进阶：
 *
 * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例 2：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 *
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 *  
 *
 * 提示：
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums 是一个非递减数组
 * -109 <= target <= 109
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xv4bbv/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list= new ArrayList<>();
        if(nums.length==1){
            if(nums[0]==target){
                return new int[]{0,0};
            }else{
                return new int[]{-1,-1};
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        if(list.size()==0){
            return new int[]{-1,-1};
        }else if(list.size()==1){
            return new int[]{list.get(0),list.get(0)};
        }else {
            return new int[]{list.get(0),list.get(list.size()-1)};
        }
    }
}
