// DSA based Day 8 
// https://leetcode.com/problems/odd-even-linked-list/description/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
           return head;

        ListNode first=head;
        ListNode second=head.next;
        ListNode odd=first;
        ListNode even=second;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }   
        odd.next=second;
        return head;
    }
}