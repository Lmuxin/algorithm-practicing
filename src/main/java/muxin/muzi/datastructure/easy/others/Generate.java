package muxin.muzi.datastructure.easy.others;

/**
 * @Author: smallming
 * @Date: 2021/10/13 3:02 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * <p>
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * <p>
 * <p>
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * 示例 2:
 * <p>
 * 输入: numRows = 1
 * 输出: [[1]]
 *  
 * <p>
 * 提示:
 * <p>
 * 1 <= numRows <= 30
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xncfnv/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        //每一行的元素
        ArrayList<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            //下面一行都会比上面一行多一个元素，我们在第一个位置给他加个1
            row.add(0, 1);
            //遍历每一行的结果，遍历的时候跳过第一个和最后一个，
            //每个格子的值都是他正上面和左上角元素的和
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            //把结果存放到res中
            result.add(new ArrayList<>(row));
        }
        return result;
    }
}
