package muxin.muzi.datastructure.sort;

/**
 * @Author: smallming
 * @Date: 2021/11/3 11:04 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */
public class ChooseSort {

    //选择排序
    public void choosesort(int[] nums){
        for(int i = 0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++ ){
                if(nums[i]>nums[j]){
                    swap(nums[i],nums[j]);
                }
            }
        }
    }


    public void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
