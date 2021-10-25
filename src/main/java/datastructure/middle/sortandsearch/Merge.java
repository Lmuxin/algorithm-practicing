package datastructure.middle.sortandsearch;

/**
 * @Author: smallming
 * @Date: 2021/10/15 4:52 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 合并区间
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2：
 *
 * 输入：intervals = [[1,4],[4,5]]
 * 输出：[[1,5]]
 * 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
 *  
 *
 * 提示：
 *
 * 1 <= intervals.length <= 104
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 104
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xv11yj/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Merge {
    public int[][] merge(int[][] intervals) {

        //按区间左侧端点值进行排序
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            //处理末位区间
            if (i == intervals.length - 1) {
                ans.add(new int[]{intervals[i][0], intervals[i][1]});
                break;
            }
            //处理常规区间，区间存在交集时，将交集赋值给下标为i+1的区间
            if (intervals[i][1] >= intervals[i + 1][0] && intervals[i][0] <= intervals[i + 1][1]) {
                intervals[i + 1][0] = intervals[i][0] <= intervals[i + 1][0] ? intervals[i][0] : intervals[i + 1][0];
                intervals[i + 1][1] = intervals[i][1] >= intervals[i + 1][1] ? intervals[i][1] : intervals[i + 1][1];
                continue;
            }
            //区间不存在交集时，存入集合
            ans.add(new int[]{intervals[i][0], intervals[i][1]});
        }
        return ans.toArray(new int[ans.size()][2]);

    }
}
