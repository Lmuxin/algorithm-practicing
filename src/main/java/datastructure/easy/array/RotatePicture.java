package datastructure.easy.array;

/**
 * @Author: smallming
 * @Date: 2021/10/08/3:53 下午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 旋转图像
 * <p>
 * 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * <p>
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 * <p>
 *  
 * <p>
 * 示例 1：
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[7,4,1],[8,5,2],[9,6,3]]
 * <p>
 * 示例 2：
 * 输入：matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * 输出：[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 * <p>
 * 示例 3：
 * 输入：matrix = [[1]]
 * 输出：[[1]]
 * <p>
 * 示例 4：
 * 输入：matrix = [[1,2],[3,4]]
 * 输出：[[3,1],[4,2]]
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnhhkv/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class RotatePicture {
    public void rotate(int[][] matrix) {

        int length = matrix.length;
        //先上下交换
        for (int i = 0; i < length / 2; i++) {
            int temp[] = matrix[i];
            matrix[i] = matrix[length - i - 1];
            matrix[length - i - 1] = temp;
        }
        //再对角线交换
        for(int i = 0;i < length;i++){
            for(int j = i+1;j<length;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];;
                matrix[j][i] = temp;
            }
        }

    }
}
