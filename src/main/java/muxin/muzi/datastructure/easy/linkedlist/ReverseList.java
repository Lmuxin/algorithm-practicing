package muxin.muzi.datastructure.easy.linkedlist;

/**
 * @Author: smallming
 * @Date: 2021/10/11/6:03 下午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */

import java.util.Stack;

/**
 * 反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * 示例 2：
 *
 *
 * 输入：head = [1,2]
 * 输出：[2,1]
 * 示例 3：
 *
 * 输入：head = []
 * 输出：[]
 *  
 *
 * 提示：
 *
 * 链表中节点的数目范围是 [0, 5000]
 * -5000 <= Node.val <= 5000
 *  
 *
 * 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
 *
 * 相关标签
 * 递归
 *
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnnhm6/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode begin = head;
        while(begin!=null){
            stack.push(begin);
            begin = begin.next;
        }
        if(stack.isEmpty()){
            return null;
        }
        ListNode node = stack.pop();
        ListNode dummy = node;
        while(!stack.isEmpty()){
            ListNode tmp = stack.pop();
            node.next = tmp;
            node = node.next;
        }
        //最后一个结点就是反转前的头结点，一定要让他的next
        //等于空，否则会构成环
        node.next=null;
        return dummy;
    }
}
