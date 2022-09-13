package Linked_Queue_Stack.linked;

/**
 * 分隔链表
 */
public class PartitionListNode {
    //双指针
    public ListNode partition(ListNode head,int x){
        if (head == null){
            return head;
        }
        ListNode left=new ListNode();
        ListNode right=new ListNode();
        ListNode lt=left;
        ListNode rt=right;
        while(head!=null){
            if(head.val<x){
                lt.next=head;
                lt=lt.next;
            }else{
                rt.next=head;
                rt=rt.next;
            }
            head=head.next;
        }
        rt.next=null;
        lt.next=right.next;
        return left.next;
    }
}
