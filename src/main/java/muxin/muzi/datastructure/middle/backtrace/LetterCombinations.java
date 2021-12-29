package muxin.muzi.datastructure.middle.backtrace;

/**
 * @Author: smallming
 * @Date: 2021/10/15 11:16 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.*;

/**
 * 电话号码的字母组合
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *
 *
 *  
 *
 * 示例 1：
 *
 * 输入：digits = "23"
 * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 示例 2：
 *
 * 输入：digits = ""
 * 输出：[]
 * 示例 3：
 *
 * 输入：digits = "2"
 * 输出：["a","b","c"]
 *  
 *
 * 提示：
 *
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ['2', '9'] 的一个数字。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xv8ka1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
        Deque<Character> deque = new LinkedList<>();
        Map<Character,String > map = new HashMap<>();
        map.put('2',"abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        dfs(digits,deque,0,res,map);
        return res;
    }

    private void dfs(String digits, Deque<Character> deque, int deep, List<String> res, Map<Character, String> map) {
        if(deque.size()==digits.length()){
            StringBuffer sb = new StringBuffer();
            deque.forEach(item->{
                sb.append(item);
            });
            res.add(sb.toString());
            return;
        }

        String s = map.get(digits.charAt(deep));
        for(int i=0;i<s.length();i++){
            deque.addLast(s.charAt(i));
            dfs(digits,deque,deep+1,res,map);
            deque.removeLast();
        }
    }
}
