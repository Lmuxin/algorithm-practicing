package datastructure.middle.backtrace;

/**
 * @Author: smallming
 * @Date: 2021/10/15 3:11 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.*;

/**
 * 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 * 有效括号组合需满足：左括号必须以正确的顺序闭合。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：["()"]
 *  
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xv33m7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String > res = new ArrayList<>();
        Deque<String > deque = new LinkedList<>();
        int l = 0;
        int r =0;
        dfs(l,r,n,deque,res);
        return res;
    }

    private void dfs(int l, int r, int n, Deque<String> deque, List<String> res) {
        if(deque.size()==n*2){
            StringBuffer sb = new StringBuffer();
            for(String string : deque){
                sb.append(string);
            }
            res.add(sb.toString());
            return;
        }
        if(l<n){
            deque.addLast("(");
            dfs(l+1,r,n,deque,res);
            deque.removeLast();
        }

        if(r<l){
            deque.addLast(")");
            dfs(l,r+1,n,deque,res);
            deque.removeLast();
        }
    }
}
