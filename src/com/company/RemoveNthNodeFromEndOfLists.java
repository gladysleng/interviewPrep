package com.company;

public class RemoveNthNodeFromEndOfLists {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        ListNode nodeBeforeDelete = dummy;
        ListNode nodeChecker = dummy;

        dummy.next = head;

        for(int i = 1; i <= n+1; i++){
            nodeChecker = nodeChecker.next;
        }

        while(nodeChecker != null){
            nodeBeforeDelete = nodeBeforeDelete.next;
            nodeChecker = nodeChecker.next;
        }

        nodeBeforeDelete.next = nodeBeforeDelete.next.next;

        return dummy.next;
    }
}
