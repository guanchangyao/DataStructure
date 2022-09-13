package Linked_Queue_Stack.linked;

/**
 * 合并两个有序链表
 */
public class MergeListNode {
    //使用递归的方式处理
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if(list1 ==null){
//            return list2;
//        }
//        if(list2 ==null){
//            return list1;
//        }
//        if(list1.val <list2.val){
//            list1.next=mergeTwoLists(list1.next,list2);
//            return list1;
//        }else{
//            list2.next=mergeTwoLists(list1,list2.next);
//            return list2;
//        }
//    }

    //使用迭代的方式处理
    public ListNode mergeListNode(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode allNode = new ListNode();
        ListNode temp = allNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        temp.next = l1 != null ? l1 : l2;
        return allNode.next;
    }
}
