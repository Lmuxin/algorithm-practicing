package muxin.muzi.datastructure.middle.others;

/**
 * @Author: smallming
 * @Date: 2021/10/15 7:45 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[3,2,3]
 * 输出：3
 * 示例 2：
 *
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 *  
 *
 * 进阶：
 *
 * 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xwnvrj/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 1;
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            if(res == nums[i]){
                count++;
            }else {
                count--;
                if(count==0){
                    res = nums[i+1];
                }
            }
        }
        return res;
    }
}

