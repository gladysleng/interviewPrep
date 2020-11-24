package com.company;

public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        if(node.next != null){
            node.val = node.next.val;
            node.next = node.next.next;
        }

    }
}
