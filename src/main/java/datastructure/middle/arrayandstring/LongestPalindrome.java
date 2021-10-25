package datastructure.middle.arrayandstring;

/**
 * @Author: smallming
 * @Date: 2021/10/14 11:02 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 最长回文子串
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 * <p>
 * 输入：s = "cbbd"
 * 输出："bb"
 * 示例 3：
 * <p>
 * 输入：s = "a"
 * 输出："a"
 * 示例 4：
 * <p>
 * 输入：s = "ac"
 * 输出："a"
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母（大写和/或小写）组成
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvn3ke/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        //start表示最长回文串开始的为位置
        //maxlen表示最长回文串的长度
        int start = 0, maxLen = 0;
        int length = s.length();
        for (int i = 0; i < length;) {
            //如果剩余字串长度小于目前查找到的最长回文字串的长度，直接终止循环
            //因为即使他是回文字串，也不是最长的
            if (length - 1 <= maxLen / 2) {
                break;
            }
            int left = i, right = i;
            while (right < length - 1 && s.charAt(right + 1) == s.charAt(right))
                ++right; //过滤掉重复
            //下次再判断的时候从重复的下一个字符串开始
            i = right + 1;
            //然后往两边判断 找出回文字串长度
            while (right < length - 1 && left > 0 && s.charAt(right + 1) == s.charAt(left - 1)) {
                ++right;
                --left;
            }
            //保留最长的
            if (right - left + 1 > maxLen) {
                start = left;
                maxLen = right - left + 1;
            }
        }
        //截取回文字串
        return s.substring(start, start + maxLen);
    }
}
