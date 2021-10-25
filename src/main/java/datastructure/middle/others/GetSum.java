package datastructure.middle.others;

/**
 * @Author: smallming
 * @Date: 2021/10/15 5:46 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 *两整数之和
 * 给你两个整数 a 和 b ，不使用 运算符 + 和 - ​​​​​​​，计算并返回两整数之和。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：a = 1, b = 2
 * 输出：3
 * 示例 2：
 *
 * 输入：a = 2, b = 3
 * 输出：5
 *  
 *
 * 提示：
 *
 * -1000 <= a, b <= 1000
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xwaiag/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class GetSum {
    public int getSum(int a, int b) {
        /**
         * 通过位运算得到结果。
         *
         * ^是“半加”，“不进位加”，使用异或得到除去进位的那部分结果
         * 只有1&1=1，其余都为0，所以可以使用&表示进位的那部分结果
         * 因为&的结果表示的是进位，所以将&的结果向左移1位
         * 若&结果不为null，继续上面操作直至&结果为null（即没有进位）
         *
         *
         *
         * 作者：胡矣
         * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xwaiag/?discussion=MiPBIh
         * 来源：力扣（LeetCode）
         * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
         */
        if (a == 0) return b;
        return getSum((a & b) << 1, a ^ b);
    }
}
