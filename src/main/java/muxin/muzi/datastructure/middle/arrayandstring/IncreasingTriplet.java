package muxin.muzi.datastructure.middle.arrayandstring;

/**
 * @Author: smallming
 * @Date: 2021/10/14 11:05 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 递增的三元子序列
 * 给你一个整数数组 nums ，判断这个数组中是否存在长度为 3 的递增子序列。
 *
 * 如果存在这样的三元组下标 (i, j, k) 且满足 i < j < k ，使得 nums[i] < nums[j] < nums[k] ，返回 true ；否则，返回 false 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,4,5]
 * 输出：true
 * 解释：任何 i < j < k 的三元组都满足题意
 * 示例 2：
 *
 * 输入：nums = [5,4,3,2,1]
 * 输出：false
 * 解释：不存在满足题意的三元组
 * 示例 3：
 *
 * 输入：nums = [2,1,5,0,4,6]
 * 输出：true
 * 解释：三元组 (3, 4, 5) 满足题意，因为 nums[3] == 0 < nums[4] == 4 < nums[5] == 6
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 *  
 *
 * 进阶：你能实现时间复杂度为 O(n) ，空间复杂度为 O(1) 的解决方案吗？
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvvuqg/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        //3个数字 small记录最小值
        int small = Integer.MAX_VALUE;
        //mid记录中间值
        int mid = Integer.MAX_VALUE;
        for(int num :nums){
            if(num<=small){
                //记录遍历过的最小值
                small = num;
            }else if(num<=mid){
                //比small大的最小值
                mid = num;
            }else {
                return true;
            }
        }
        return false;
    }
}
