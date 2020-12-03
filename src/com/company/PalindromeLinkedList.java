package com.company;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode firstHead = head;
        ListNode secondHead = reverse(slow.next);

        while(secondHead != null && firstHead != null){
            if(secondHead.val != firstHead.val){
                return false;
            }
            secondHead = secondHead.next;
            firstHead = firstHead.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

}
