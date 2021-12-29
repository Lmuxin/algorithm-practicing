package muxin.muzi.datastructure.sort;

/**
 * @Author: smallming
 * @Date: 2021/11/3 11:08 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */
public class BubbleSort {
    //冒泡排序

    public void bubbleSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums[j], nums[j + 1]);
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
