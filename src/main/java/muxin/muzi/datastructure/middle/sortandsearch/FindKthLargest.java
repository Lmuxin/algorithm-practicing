package muxin.muzi.datastructure.middle.sortandsearch;

/**
 * @Author: smallming
 * @Date: 2021/10/15 4:15 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 数组中的第K个最大元素
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 *
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * 示例 2:
 *
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 *  
 *
 * 提示：
 *
 * 1 <= k <= nums.length <= 104
 * -104 <= nums[i] <= 104
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvsehe/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class FindKthLargest {
        public int findKthLargest(int[] nums, int k) {
            int res = 0;
            int len = nums.length;
            heapify(nums, len); // 先构建大顶堆
            for(int i = 0;i<len;i++){
                if(k<=1){
                    res = nums[0];
                    break;
                }
                k--;
                int last = len-1-i;  // 找到未排序的最后一个元素索引
                swap(nums,0,last);  // 交换
                heap(nums,last,0);  // 再次堆化
            }
            return res;
        }

        public void heapify(int[] tree, int n){  // 依次从最后一个父节点进行堆化
            int temp = (n-1-1)/2;  // 最后一个父节点的索引位置
            for(int i = temp;i>=0;i--){
                heap(tree, n, i);
            }
        }

        // 堆化（大顶堆堆化）
        public void heap(int[] tree, int n, int i){
            int c1 = 2*i+1;
            int c2 = 2*i+2;
            int max = i;  //默认是根节点为最大值的索引
            if(c1<n && tree[c1]>tree[max]){
                max = c1;
            }
            if(c2<n && tree[c2]>tree[max]){
                max = c2;
            }
            if(max != i){
                swap(tree, max, i);
                heap(tree, n, max);  // 递归堆化子树
            }
        }

        public void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

}
