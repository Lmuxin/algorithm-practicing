package datastructure.easy.linkedlist;

/**
 * @Author: smallming
 * @Date: 2021/10/11/7:07 下午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 示例 2：
 * <p>
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnnbp2/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode copy = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                copy.next = l1;
                l1 = l1.next;
            } else {
                copy.next = l2;
                l2 = l2.next;
            }
            copy = copy.next;
        }
        copy.next = l1 == null ? l2 : l1;
        return head.next;
    }
}
