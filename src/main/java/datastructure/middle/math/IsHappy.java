package datastructure.middle.math;

/**
 * @Author: smallming
 * @Date: 2021/10/16 10:46 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 快乐数
 * 编写一个算法来判断一个数 n 是不是快乐数。
 *
 * 「快乐数」定义为：
 *
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 * 如果 可以变为  1，那么这个数就是快乐数。
 * 如果 n 是快乐数就返回 true ；不是，则返回 false 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：19
 * 输出：true
 * 解释：
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * 示例 2：
 *
 * 输入：n = 2
 * 输出：false
 *  
 *
 * 提示：
 *
 * 1 <= n <= 231 - 1
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xw99u7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class IsHappy {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n!=1){
            int temp = 0;
            int sum = 0;
            while (temp>=10){
                int mod = temp%10;
                temp/=10;
                sum+=mod*mod;
            }
            sum+=temp*temp;
            if(!set.add(sum)){
                return false;
            }
            n=sum;
        }
        return true;
    }
}
