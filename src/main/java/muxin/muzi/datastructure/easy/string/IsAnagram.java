package muxin.muzi.datastructure.easy.string;

/**
 * @Author: smallming
 * @Date: 2021/10/11/2:50 下午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.Arrays;

/**
 * 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 *  
 * <p>
 * 提示:
 * <p>
 * 1 <= s.length, t.length <= 5 * 104
 * s 和 t 仅包含小写字母
 *  
 * <p>
 * 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn96us/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] charst = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(charst);
        return Arrays.equals(chars, charst);
    }
}
