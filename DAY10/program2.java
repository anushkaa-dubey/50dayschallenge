// DSA based 
// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
class Solution {
    public ListNode deleteMiddle(ListNode head) {
                if(head == null || head.next == null) return null;
        ListNode prev=null,slow=head,fast=head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev == null) return null;
        prev.next = slow.next;
        return head;

    }
}