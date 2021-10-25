package datastructure.easy.linkedlist;

/**
 * @Author: smallming
 * @Date: 2021/10/11/5:33 下午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.stream.Stream;

/**
 * 删除链表的倒数第N个节点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * 进阶：你能尝试使用一趟扫描实现吗？
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 * <p>
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 *  
 * <p>
 * 提示：
 * <p>
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn2925/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode lenth = head;
        int count = 0;
        while (lenth != null) {
            count++;
            lenth = lenth.next;
        }
        int i = count - n;
//
//        int len = 0;
//        while (lenth != null) {
//            len++;
//            lenth = lenth.next;
//        }
//
//        int i = len-n;
        if(i==0){
            return head.next;
        }
        for(int m=0;m<i-1;m++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }

}
