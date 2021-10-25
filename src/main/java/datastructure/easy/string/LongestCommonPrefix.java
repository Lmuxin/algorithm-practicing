package datastructure.easy.string;

/**
 * @Author: smallming
 * @Date: 2021/10/11/4:20 下午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *  
 *
 * 提示：
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnmav1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if(strs ==null||strs.length==0){
            return "";
        }
        String pre = strs[0];
        int i =1;
        while (i<strs.length){
            while (strs[i].indexOf(pre)!=0){
                pre = pre.substring(0,pre.length()-1);
            }
            i++;
        }
        return pre ;
    }
}
