package muxin.muzi.datastructure.easy.array;

import java.util.Arrays;

/**
 * @Author: smallming
 * @Date: 2021/09/28/7:43 下午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */


/**
 * 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 *示例 1:
 * 输入: [1,2,3,1]
 * 输出: true
 *
 * 示例 2:
 * 输入: [1,2,3,4]
 * 输出: false
 *
 * 示例 3:
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 *
 *
 */
public class IsExistDuplicate {
    public boolean containsDuplicate(int[] nums) {

        /** 下面这种方法超时 **/
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if(nums[i]==nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;


        //先排序
        Arrays.sort(nums);
        //再比较
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
