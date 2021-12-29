package muxin.muzi.datastructure.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: smallming
 * @Date: 2021/09/29/11:00 上午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 *两个数组的交集 II
 *给定两个数组，编写一个函数来计算它们的交集。
 *示例 1：
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 *
 * 示例 2:
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 *
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
 * 我们可以不考虑输出结果的顺序。
 *
 * 进阶：
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2y0c2/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */



public class ArrayIntersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
//        int[] resultArrsy = new int[result.size()];
//        for (int k = 0; k < result.size(); k++) {
//            resultArrsy[k] = result.get(k);
//        }
//        return resultArrsy;
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }


    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        return build(nums);
    }


    //int[] nums 排序之后的数组
    public List<List<Integer>> build(int[] nums) {
        //为其他2个位置预留2个位置出来
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            //过滤相同字符
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //左指针
            int left_idx = i + 1;
            //右指针
            int right_idx = nums.length - 1;
            //为了防止重复而坐
            while (left_idx < right_idx) {
                //开始处理
                int sum = nums[i] + nums[left_idx] + nums[right_idx];
                if (sum < 0) {
                    //移动左边 你这时候移动右边会变更小
                    //说明太小了要变大
                    left_idx++;
                    continue;
                } else if (sum > 0) {
                    //说明太大了要缩小 移动左边会变更大
                    //移动右边
                    right_idx--;
                    continue;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left_idx]);
                    list.add(nums[right_idx]);
                    res.add(list);
                    //同时移动
                    right_idx--;
                    left_idx++;
                    //去重
                    while (left_idx < right_idx && nums[left_idx] == nums[left_idx - 1])
                        left_idx++;
                    while (left_idx < right_idx && nums[right_idx] == nums[right_idx + 1])
                        right_idx--;
                }

            }
        }
        return res;
    }


}
