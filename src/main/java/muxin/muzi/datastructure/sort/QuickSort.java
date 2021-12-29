package muxin.muzi.datastructure.sort;

/**
 * @Author: smallming
 * @Date: 2021/11/3 2:52 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */
public class QuickSort {
    //快排
    public void quickSort(int[] nums){
        quickSort(nums,0,nums.length-1);
    }

    private void quickSort(int[] nums, int left, int right) {
        if(left>=right) return;
        int part = partition(nums,left,right);
        quickSort(nums,left,part-1);
        quickSort(nums,part+1,right);

    }

    private int partition(int[] nums, int left, int right) {
        //选最右边为基准
        int pivot = nums[right];
        int i = left;
        int j = right-1;
        while (i<=j){
            //从左往右找大于基准大
            while (i<=j && nums[i]<=pivot) i++;
            //从右往左找比基准小的
            while (i<=j && nums[j]>pivot)j++;
            if(i<j)swap(nums,i,j);
        }
        swap(nums,i,right);

        return i;
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
    }
}
