package muxin.muzi.datastructure.sort;

/**
 * @Author: smallming
 * @Date: 2021/11/3 3:25 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */
public class CountSort {
    //计数排序
    public int[] countSort(int[] nums){
        int[] result = new int[nums.length];
        int[] temp  = new int[100];
        for(int i = 0;i<nums.length;i++){
            temp[nums[i]]++;
        }
        int m = 0;
        for(int j=0;j<temp.length;j++){
            while (temp[j]-->0) result[m++]=j;
        }
        return result;
    }
}
