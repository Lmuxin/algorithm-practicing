package muxin.muzi.datastructure.middle.arrayandstring;

/**
 * @Author: smallming
 * @Date: 2021/10/13 4:22 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 * 示例 2：
 * <p>
 * 输入：nums = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：nums = [0]
 * 输出：[]
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvpj16/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //先对数组进行排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            //过滤掉重复的
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            //因为是排序的，如果第一个数字大于0，那么后面的也都
            //大于0，他们三个数字的和不可能等于0
            if (nums[i] > 0)
                break;
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];
            while (left < right) {
                //左右指针的和
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    //找到了一组，把他们加入到集合list中
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //过滤掉重复的
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;
                    left++;
                    right--;

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
