package muxin.muzi.datastructure.sort;

/**
 * @Author: smallming
 * @Date: 2021/11/3 12:05 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */
public class MergeSort {
    ///归并排序
    public void mergeSort(int[] nums) {
        sort(nums, 0, nums.length - 1);

    }

    private void sort(int[] nums, int left, int right) {
        if (left == right) return;
        int mid = left + (right - left) / 2;
        sort(nums, left, mid);
        sort(nums, mid + 1, right);
        merge(nums, left, mid + 1, right);
    }

    private void merge(int[] nums, int left, int right, int rightBound) {
        int mid = right - 1;
        int[] temp = new int[rightBound - left + 1];
        int m = left;
        int n = right;
        int k = 0;
        while (m <= mid && n <= rightBound) {
            if (nums[m] <= nums[n]) {
                temp[k++] = nums[m++];
            } else {
                temp[k++] = nums[n++];
            }
        }
        while (m <= mid) {
            temp[k++] = nums[m++];
        }
        while (n <= rightBound) {
            temp[k++] = nums[n++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[i + left] = temp[i];
        }

    }
}
