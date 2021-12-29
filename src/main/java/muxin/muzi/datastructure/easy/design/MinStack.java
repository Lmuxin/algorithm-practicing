package muxin.muzi.datastructure.easy.design;

/**
 * @Author: smallming
 * @Date: 2021/10/12/4:35 下午
 * @Motto Stay Hungry,Stay Foolish.--SteveJobs
 */

/**
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 *  
 *
 * 示例:
 *
 * 输入：
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 *
 * 输出：
 * [null,null,null,null,-3,null,0,-2]
 *
 * 解释：
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 *  
 *
 * 提示：
 *
 * pop、top 和 getMin 操作总是在 非空栈 上调用。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnkq37/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MinStack {
    private ListNode head;

    public MinStack() {

    }

    public void push(int val) {

        if(empty()){
            head = new ListNode(val,val,null);
        }else{
            head = new ListNode(val,Math.min(val,head.min),head);
        }
    }

    private boolean empty() {
        return head == null;
    }

    public void pop() {
        if(empty()){
            throw new IllegalStateException("栈为空。。。");
        }
        head = head.next;

    }

    public int top() {
        if(empty()){
            throw new IllegalStateException("栈为空。。。");
        }
        return head.val;

    }

    public int getMin() {
        if(empty()){
            throw new IllegalStateException("栈为空。。。");
        }
        return head.min;

    }
}

class ListNode {
    public int val;
    public int min;//最小值
    public ListNode next;

    public ListNode(int val, int min, ListNode next) {
        this.val = val;
        this.min = min;
        this.next = next;
    }
}

