package muxin.muzi.datastructure.middle.arrayandstring;

/**
 * @Author: smallming
 * @Date: 2021/10/13 5:46 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 矩阵置零
 * 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
 *
 * 进阶：
 *
 * 一个直观的解决方案是使用  O(mn) 的额外空间，但这并不是一个好的解决方案。
 * 一个简单的改进方案是使用 O(m + n) 的额外空间，但这仍然不是最好的解决方案。
 * 你能想出一个仅使用常量空间的解决方案吗？
 *
 * 示例 1：
 *
 *
 * 输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * 输出：[[1,0,1],[0,0,0],[1,0,1]]
 * 示例 2：
 *
 *
 * 输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * 输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvmy42/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class SetZeroes {
    public void setZeroes(int[][] matrix) {

        int m =matrix.length;//行
        int n =matrix[0].length;//列
        //row[i]表示第i行是否有0
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                //如果当前位置是0，那么当前的行 和当前的列都应该标注为0
                if(matrix[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        //把那些应该为0的行和列全部置为0
        for(int i = 0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }

            }
        }
    }

}
