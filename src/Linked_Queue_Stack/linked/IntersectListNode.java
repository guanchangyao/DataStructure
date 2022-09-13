package Linked_Queue_Stack.linked;

import java.util.HashSet;
import java.util.Set;

/**
 * 相交链表
 */
public class IntersectListNode {
        //使用哈希解决问题
//    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
//        if( headA ==null || headB==null){
//            return  null;
//        }
//        Set<ListNode> set=new HashSet();
//        while(headA!=null){
//            set.add(headA);
//            headA=headA.next;
//        }
//        while(headB!=null){
//            if(set.contains(headB)){
//                return headB;
//            }
//            headB=headB.next;
//        }
//        return null;
//    }

    /**
     * 使用双指针的方法来完成   我吹过你吹过的晚风
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA ==null || headB ==null){
            return null;
        }
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b){
            a=a==null? headB :a.next;
            b= b==null ?headA:b.next;
        }
        return a;
    }
}
