package muxin.muzi.datastructure.sort;

/**
 * @Author: smallming
 * @Date: 2021/11/3 11:11 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */
public class InsertSort {
    //插入排序
    public void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j - 1] > nums[j]) {
                    swap(nums[j - 1], nums[j]);
                }
            }
        }
    }

    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
