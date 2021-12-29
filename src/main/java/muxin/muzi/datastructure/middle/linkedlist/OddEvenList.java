package muxin.muzi.datastructure.middle.linkedlist;

/**
 * @Author: smallming
 * @Date: 2021/10/14 4:58 下午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 奇偶链表
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 *
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 * 示例 2:
 *
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 * 说明:
 *
 * 应当保持奇数节点和偶数节点的相对顺序。
 * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvdwtj/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if(head ==null || head.next==null){
            return head;
        }
        //奇链表的头节点
        ListNode oddHead = head;
        //奇链表当前节点
        ListNode oddCur = oddHead;

        //偶链表的头节点
        ListNode evebHead = head.next;
        //偶链表的当前节点
        ListNode evenCur = evebHead;

        while (evenCur !=null && evenCur.next!=null){
            //奇节点串一起
            oddCur.next = oddCur.next.next;
            //偶节点串一起
            evenCur.next = evenCur.next.next;
            //奇偶指针往后移
            oddCur= oddCur.next;
            evenCur = evenCur.next;
        }
        //最后偶数链表和奇数链表需要串在一起
        oddCur.next=evebHead;
        return oddHead;
    }
}
