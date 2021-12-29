package muxin.muzi.datastructure.middle.dynamic;

/**
 * @Author: smallming
 * @Date: 2021/10/15 5:19 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 最长上升子序列
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 * <p>
 * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 * <p>
 *  
 * 示例 1：
 * <p>
 * 输入：nums = [10,9,2,5,3,7,101,18]
 * 输出：4
 * 解释：最长递增子序列是 [2,3,7,101]，因此长度为 4 。
 * 示例 2：
 * <p>
 * 输入：nums = [0,1,0,3,2,3]
 * 输出：4
 * 示例 3：
 * <p>
 * 输入：nums = [7,7,7,7,7,7,7]
 * 输出：1
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 2500
 * -104 <= nums[i] <= 104
 *  
 * <p>
 * 进阶：
 * <p>
 * 你可以设计时间复杂度为 O(n2) 的解决方案吗？
 * 你能将算法的时间复杂度降低到 O(n log(n)) 吗?
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xwhvq3/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class lengthOfLIS {
    public int lengthOfLIS(int[] nums) {
/**
 * 根据官方题解，这里动态转移方程是：
 *     dp[i]=max(dp[j])+1,其中0≤j<i且num[j]<num[i]
 * 官方意思就是  （以示例2为例）
 *     用一个dp数组保存 以nums数组当前索引位置的元素为末尾的最长的递增子序列的长度
 *     dp[0] = 1  //一个数就是一个子序列的长度1  最长子序列：[0]
 *     dp[1] = max(dp[0]+1 = 2, 前面所有元素中比当前元素的小的最大dp值  [0,1]
 *     dp[2] = max(没有==0)+1 = 1，没有比0小的，所以直接是1     [0]
 *     dp[3] = max(dp[0],dp[1],d[2])+1 = 3,通过nums数组得有0,1,2位置的元素小于当前，找最大子序列长度来+1  [0,1,3]
 *     dp[4] = max(dp[0],dp[1],dp[2])+1 = 3 ......  [0,1,2]
 *     dp[5] = max(dp[0],dp[1],dp[2],dp[4])+1 = 4  ......  [0,1,2,3]
 *
 *     所以得到dp数组为[1,2,1,3,3,4]
 *     依次对应着nums数组索引位置元素为末尾的最长递增子序列的长度
 *     然后找到其中最大值即可。
 *
 * 作者：无厘
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xwhvq3/?discussion=9Jgjzt
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
        int len = nums.length;
        int[] dp = new int[len];
        dp[0]= 1;
        int res = 1;
        for (int i = 1; i < len; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i] && dp[j] > max) {
                    max = dp[j];
                }
            }
            dp[i] = max == Integer.MIN_VALUE ? 1 : max + 1;
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
