// Today's Challenge:
// Topic: Linked List
// Link: https://leetcode.com/problems/reverse-linked-list/
class Solution {
    public ListNode reverseList(ListNode head) {
     ListNode next;
     ListNode current = head;
     ListNode previous = null;
     if(head == null)
     {
        return null;
     }   
     while( current != null)
     {
        next=current.next;
        current.next= previous;
        previous = current;
        current = next;
     }
     return previous;

    }
}