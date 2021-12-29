package muxin.muzi.datastructure.middle.sortandsearch;

/**
 * @Author: smallming
 * @Date: 2021/10/15 4:01 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * 前 K 个高频元素
 * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 *
 * 输入: nums = [1], k = 1
 * 输出: [1]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 105
 * k 的取值范围是 [1, 数组中不相同的元素的个数]
 * 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的
 *  
 *
 * 进阶：你所设计算法的时间复杂度 必须 优于 O(n log n) ，其中 n 是数组大小。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvzpxi/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0 ;i<nums.length;i++){
//            if(map.get(nums[i])!=0){
//                map.put(nums[i],map.get(nums[i])+1);
//            }else{
//                map.put(nums[i],1);
//            }
//        }

        HashMap<Integer, Integer> xxF = new HashMap<>();

        Arrays.stream(nums).forEach(x->{
            xxF.merge(x, 1, Integer::sum);
        });

        PriorityQueue<int[]> priority = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        xxF.forEach((x, xF)->{
            priority.offer(new int[]{x, xF});
        });

        int[] res = new int[k];
        for (int i = 0; i < res.length; i++) {
            if (!priority.isEmpty()) {
                res[i] = priority.poll()[0];
            }
        }
        return res;
    }

}
