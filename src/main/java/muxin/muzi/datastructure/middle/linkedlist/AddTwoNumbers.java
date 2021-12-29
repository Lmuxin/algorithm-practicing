package muxin.muzi.datastructure.middle.linkedlist;

/**
 * @Author: smallming
 * @Date: 2021/10/14 11:40 上午
 * @Motto: Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 两数相加
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 *
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 *
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *  
 *
 * 提示：
 *
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-medium/xvw73v/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //创建一个哑节点，他的指针指向新链表的头节点
        ListNode dummyNode = new ListNode(0);
        //preNode表示当前节点的前一个节点
        ListNode preNode = dummyNode;
        //表示两个节点相加进位的值，加法最多只进一位，所以carry要么是1要么是0
        int carry = 0;
        while (l1!=null ||l2!=null ||carry!=0){
            //当前节点的累加值，需要加上前面进位的值
            int sum = carry;
            //如果第一个链表的当前节点不为空，加上第一个链表当前节点的值
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            //第二个链表同上
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }

            preNode.next = new ListNode(sum%10);

            carry=sum/10;
            preNode = preNode.next;
        }
        return dummyNode.next;
    }
}
