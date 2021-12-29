package muxin.muzi.datastructure.middle.sortandsearch;

/**
 * @Author: smallming
 * @Date: 2021/10/15 4:57 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 搜索旋转排序数组
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。
 *
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
 *
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [4,5,6,7,0,1,2], target = 0
 * 输出：4
 * 示例 2：
 *
 * 输入：nums = [4,5,6,7,0,1,2], target = 3
 * 输出：-1
 * 示例 3：
 *
 * 输入：nums = [1], target = 0
 * 输出：-1
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 5000
 * -10^4 <= nums[i] <= 10^4
 * nums 中的每个值都 独一无二
 * 题目数据保证 nums 在预先未知的某个下标上进行了旋转
 * -10^4 <= target <= 10^4
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvyz1t/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Search {
    public int search(int[] nums, int target) {
        // 1. 先找到旋转点
        // 2. 根据旋转点左右两段数据进行二分查找
        int rotateIndex = -1;
        int numsSize = nums.length;
        for (int i = 1; i < numsSize; i++) {
            if (nums[i - 1] > nums[i]) {
                rotateIndex = i - 1;
                break;
            }
        }
        int left = 0;
        int right = 0;
        int mid = 0;
        // 判断在那段有序数组中查找目标值
        if (rotateIndex == -1) {
            right = numsSize - 1;
        } else {
            // 旋转点右边有序数组
            if (nums[numsSize - 1] >= target) {
                left = rotateIndex + 1;
                right = numsSize - 1;
                // 旋转点左边有序数组
            } else if (nums[0] <= target) {
                left = 0;
                right = rotateIndex;
            } else {
                return -1;
            }
        }
        // 二分查找
        mid = left + (right - left) / 2;
        while (left <= right) {
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
            mid = left + (right - left) / 2;
        }
        return -1;

    }


    //这样也行
    public int searchTwo(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
