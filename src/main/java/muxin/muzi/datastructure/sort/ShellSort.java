package muxin.muzi.datastructure.sort;

/**
 * @Author: smallming
 * @Date: 2021/11/3 11:13 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */
public class ShellSort {
    //希尔排序

    public void shellSort(int[] nums) {
        for (int gap = nums.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < nums.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (nums[j] < nums[j - gap]) {
                        swap(nums[j], nums[j - gap]);
                    }
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
