package datastructure.middle.math;

/**
 * @Author: smallming
 * @Date: 2021/10/16 10:56 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 阶乘后的零
 * 给定一个整数 n ，返回 n! 结果中尾随零的数量。
 *
 * 提示 n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：0
 * 解释：3! = 6 ，不含尾随 0
 * 示例 2：
 *
 * 输入：n = 5
 * 输出：1
 * 解释：5! = 120 ，有一个尾随 0
 * 示例 3：
 *
 * 输入：n = 0
 * 输出：0
 *  
 *
 * 提示：
 *
 * 0 <= n <= 104
 *  
 *
 * 进阶：你可以设计并实现对数时间复杂度的算法来解决此问题吗？
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xwehi5/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class TrailingZeroes {

    //栈溢出
    /*public int trailingZeroes(int n) {
        int result = muti(n);
        int count =0;
        if(result%10!=0){
            return 0;
        }else{
            while(result%10==0){
                count++;
                result/=10;
            }

        }
        return count;
    }

    private int muti(int n) {
        if(n==1){
            return n;
        }else{
            return n*muti(n-1);
        }
    }*/

    //这题目就是计算n以内能分解出几个5，最终有几个5就有几个0
    public int trailingZeroes(int n) {
        int count = 0;
        while (n>=5){
            count+=n/5;
            n/=5;
        }
        return count;
    }
}
