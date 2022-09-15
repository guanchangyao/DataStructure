package Linked_Queue_Stack.linked;

import java.util.Stack;

/**
 * 反转链表 LeetCode206
 */
public class ReverseListNode {
    //迭代写法
//    public static ListNode reverseListNode(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode newHead = null;
//        while (head != null) {
//            ListNode temp = head.next;
//            head.next = newHead;
//            newHead = head;
//            head = temp;
//        }
//        return newHead;
//    }
    //使用栈的写法
    public static ListNode reverseListNode(ListNode head) {
        if(head ==null || head.next==null){
            return  head;
        }
        Stack<ListNode> stack=new Stack<>();
        while (head!=null){
            stack.add(head);
            head=head.next;
        }
        ListNode newHead=new ListNode();
        ListNode temp=newHead;
        while (!stack.isEmpty()){
            temp.next=stack.pop();
            temp=temp.next;
        }
        temp.next=null;
        return newHead.next;
    }
    //递归写法
//    public static ListNode reverseListNode(ListNode head){
//        if(head==null|| head.next ==null){
//            return head;
//        }
//        ListNode cur=reverseListNode(head.next);
//        head.next.next=head;
//        head.next=null;
//        return cur;
//    }
}
