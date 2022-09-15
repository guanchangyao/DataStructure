package Linked_Queue_Stack.linked;


import java.util.HashSet;
import java.util.Set;

/**
 * 环型链表||
 */
public class AuraListNodeTwo {
    //使用哈希表解决
//    public ListNode detectCycle(ListNode head){
//        if(head ==null){
//            return null;
//        }
//        Set<ListNode> set=new HashSet();
//        while(head!=null){
//            if(set.contains(head)){
//                return head;
//            }else{
//                set.add(head);
//            }
//            head=head.next;
//        }
//        return null;
//    }
    public ListNode detectCycle(ListNode head){
        if(head ==null){
            return null;
        }
        Set<ListNode> set=new HashSet();
        while(head!=null){
            if(set.contains(head)){
                return head;
            }else{
                set.add(head);
            }
            head=head.next;
        }
        return null;
    }
}
