package muxin.muzi.datastructure.easy.array;


/**
 * @Author: smallming
 * @Date: 2021/09/29/3:38 下午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * 说明:
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2ba4i/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MoveZero {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int index = 0;
        for (int i = 0; i < length; i++) {
            if(nums[i]!=0){
                nums[index++] = nums[i];
            }
        }
        while (index<length){
            nums[index]=0;
            index++;
        }
    }
}
