package datastructure.middle.math;

/**
 * @Author: smallming
 * @Date: 2021/10/16 11:08 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * Pow(x, n)
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：x = 2.00000, n = 10
 * 输出：1024.00000
 * 示例 2：
 *
 * 输入：x = 2.10000, n = 3
 * 输出：9.26100
 * 示例 3：
 *
 * 输入：x = 2.00000, n = -2
 * 输出：0.25000
 * 解释：2-2 = 1/22 = 1/4 = 0.25
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xwo102/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MyPow {
    public double myPow(double x, int n) {
        double res = 1.0;
        int m = n ;
        while (m!=0){
            if(m%2!=0){
                res*=x;
            }
            x*=x;
            m/=2;
        }
        return n>=0?res:1/res;
    }
}
