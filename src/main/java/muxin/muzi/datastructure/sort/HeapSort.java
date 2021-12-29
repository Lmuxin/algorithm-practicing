package muxin.muzi.datastructure.sort;

/**
 * @Author: smallming
 * @Date: 2021/11/3 7:55 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */
public class HeapSort {
    //堆排序
    public void heapSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            heapInsert(nums, i);
        }
        int heapSize = nums.length;
        swap(nums, 0, --heapSize);
        while (heapSize > 0) {
            heapfiy(nums, 0, heapSize);
            swap(nums, 0, --heapSize);
        }
    }

    private void heapfiy(int[] nums, int i, int heapSize) {
        int left = i * 2 + 1;
        while (i < heapSize) {
            int largest = (left + 1 < heapSize && nums[left + 1] > nums[i]) ? left + 1 : left;
            largest = nums[largest] > nums[i] ? largest : i;
            if (largest == i) break;
            swap(nums, largest, i);
            i = largest;
            left = i * 2 + 1;
        }
    }

    private void heapInsert(int[] nums, int i) {
        while (nums[i] > nums[(i - 1) / 2]) {
            swap(nums, i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
