package muxin.muzi.datastructure.middle.math;

/**
 * @Author: smallming
 * @Date: 2021/10/16 11:16 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 分数到小数
 * 给定两个整数，分别表示分数的分子 numerator 和分母 denominator，以 字符串形式返回小数 。
 *
 * 如果小数部分为循环小数，则将循环的部分括在括号内。
 *
 * 如果存在多个答案，只需返回 任意一个 。
 *
 * 对于所有给定的输入，保证 答案字符串的长度小于 104 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：numerator = 1, denominator = 2
 * 输出："0.5"
 * 示例 2：
 *
 * 输入：numerator = 2, denominator = 1
 * 输出："2"
 * 示例 3：
 *
 * 输入：numerator = 2, denominator = 3
 * 输出："0.(6)"
 * 示例 4：
 *
 * 输入：numerator = 4, denominator = 333
 * 输出："0.(012)"
 * 示例 5：
 *
 * 输入：numerator = 1, denominator = 5
 * 输出："0.2"
 *  
 *
 * 提示：
 *
 * -231 <= numerator, denominator <= 231 - 1
 * denominator != 0
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xwm8ne/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class FractionToDecimal {
    public String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            return "";
        }
        if (numerator == 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        long num = numerator;
        long den = denominator;

        //1
        if ((num >= 0) ^ (den >= 0)) {
            res.append("-");
        }
        num = Math.abs(num);
        den = Math.abs(den);

        //2
        res.append(num / den);
        num %= den;
        if (num == 0) {
            return res.toString();
        }

        //3
        res.append(".");
        int index = res.length() - 1;
        Map<Long, Integer> record = new HashMap<>();
        while (num != 0 && !record.containsKey(num)) {
            record.put(num, ++index);
            num *= 10;
            res.append(num / den);
            num %= den;
        }
        if (record.containsKey(num)) {
            res.insert(record.get(num), "(");
            res.append(")");
        }
        return res.toString();
    }
}
