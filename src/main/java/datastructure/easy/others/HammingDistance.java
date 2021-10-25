package datastructure.easy.others;

/**
 * @Author: smallming
 * @Date: 2021/10/12/6:11 下午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 *汉明距离
 * 两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给你两个整数 x 和 y，计算并返回它们之间的汉明距离。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：x = 1, y = 4
 * 输出：2
 * 解释：
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * 上面的箭头指出了对应二进制位不同的位置。
 * 示例 2：
 *
 * 输入：x = 3, y = 1
 * 输出：1
 *  
 *
 * 提示：
 *
 * 0 <= x, y <= 231 - 1
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnyode/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        //就是先进行异或，然后计算1的数量，就是汉明距离
        int xor = x^y;
        int res = 0;
        while (xor!=0){
            res+=xor&1;
            xor=xor>>>1;
        }
        return res;
    }
}
