package muxin.muzi.datastructure.middle.backtrace;

/**
 * @Author: smallming
 * @Date: 2021/10/15 3:35 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 单词搜索
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。
 * <p>
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * 输出：true
 * 示例 2：
 * <p>
 * <p>
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 * 输出：true
 * 示例 3：
 * <p>
 * <p>
 * 输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 * 输出：false
 *  
 * <p>
 * 提示：
 * <p>
 * m == board.length
 * n = board[i].length
 * 1 <= m, n <= 6
 * 1 <= word.length <= 15
 * board 和 word 仅由大小写英文字母组成
 * <p>
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvkwe2/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Exist {
    public boolean exist(char[][] board, String word) {
        char start = word.charAt(0);
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[0].length; y++) {
                if (board[x][y] == start) {
                    boolean flag = exist(0, x, y, board, word);
                    if (flag == true) {
                        return flag;
                    }
                }
            }
        }
        return false;
    }

    private boolean exist(int nth, int x, int y, char[][] board, String word) {
        if (nth == word.length()) {
            return true;
        }

        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length) {
            return false;
        }

        if (word.charAt(nth) != board[x][y] || word.charAt(nth) == ' ') {
            return false;
        }
        char cur = board[x][y];
        board[x][y] = ' ';
        boolean flag1 = exist(nth + 1, x, y - 1, board, word);
        boolean flag2 = exist(nth + 1, x, y + 1, board, word);
        boolean flag3 = exist(nth + 1, x - 1, y, board, word);
        boolean flag4 = exist(nth + 1, x + 1, y, board, word);
        board[x][y] = cur;
        return (flag1 || flag2 || flag3 || flag4);
    }
}

