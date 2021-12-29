package muxin.muzi.datastructure.easy.math;

/**
 * @Author: smallming
 * @Date: 2021/10/12/4:54 下午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.Arrays;

/**
 * 计数质数
 * 统计所有小于非负整数 n 的质数的数量。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 10
 * 输出：4
 * 解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * 示例 2：
 *
 * 输入：n = 0
 * 输出：0
 * 示例 3：
 *
 * 输入：n = 1
 * 输出：0
 *  
 *
 * 提示：
 *
 * 0 <= n <= 5 * 106
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnzlu6/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class CountPrimes {
    public int countPrimes(int n) {
//        int count = n;
//        if(n==0 || n==1){
//            return 0;
//        }
//        for(int i=2;i<=n;i++){
//            for(int j =2;j<Math.sqrt(i);j++){
//                if(i%j==0){
//                    count--;
//                    break;
//                }
//            }
//        }
//    return count;
        boolean[] isPrimes = new boolean[n];
        Arrays.fill(isPrimes,true);
        for(int i = 2;i*i<n;i++){
            if(isPrimes[i]){
                int x =i;
                while (i*x<n){
                    isPrimes[i*x]  =false;
                    x++;
                }
            }
        }
        int result = 0;
        for(int i=2;i<n;i++){
            if(isPrimes[i]){
                result++;
            }
        }
        return result;
    }
}
