package muxin.muzi.datastructure.middle.arrayandstring;

/**
 * @Author: smallming
 * @Date: 2021/10/13 6:01 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.*;

/**
 * 字母异位词分组
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 *
 * 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母都恰好只用一次。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 示例 2:
 *
 * 输入: strs = [""]
 * 输出: [[""]]
 * 示例 3:
 *
 * 输入: strs = ["a"]
 * 输出: [["a"]]
 *  
 *
 * 提示：
 *
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] 仅包含小写字母
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvaszc/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            //将字符串转为数组 再排序
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            //将排序后的字符串作为key
            String strKey = String.valueOf(ch);
            //如果map中不存在排序后的字符串
            if(!map.containsKey(strKey)){
                map.put(strKey,new ArrayList<>());
            }
            //将原字符串添加到key对应到列表中
            map.get(strKey).add(s);
        }
        return new ArrayList<>(map.values());
    }
}















