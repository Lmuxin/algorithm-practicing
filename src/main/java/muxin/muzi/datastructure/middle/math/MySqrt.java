package muxin.muzi.datastructure.middle.math;

/**
 * @Author: smallming
 * @Date: 2021/10/16 11:11 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * x 的平方根
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 *
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 *
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：x = 4
 * 输出：2
 * 示例 2：
 *
 * 输入：x = 8
 * 输出：2
 * 解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
 *  
 *
 * 提示：
 *
 * 0 <= x <= 231 - 1
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xwrzwc/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MySqrt {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while(left<=right){
            int mid = (left+right)/2;
            //注意右边的转long防止溢出
            long target = (long)mid*mid;
            if(target==x)
                return mid;
            else if(target>x){
                //一旦平方大了，就缩小右边界
                right = mid-1;
            }else{//由于题目说明是向下取整，所以在平方小于x的时候进行特殊判断
                long t = (long)(mid+1)*(mid+1);
                if(t>x)
                    return mid;
                left = mid+1;
            }
        }
        //如果跳出了while循环则说明给定的数有问题
        return -1;
    }
}
