package muxin.muzi.datastructure.sort;

/**
 * @Author: smallming
 * @Date: 2021/11/5 11:32 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */
public class BinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                //nums[mid]==target
                int i = mid;
                while (i >= 0) {
                    if ((nums[--i] < target)) {
                        return i + 1;
                    }
                }
            }
        }
        return -1;
    }
}
