// DSA based 
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;

        int cnt = getN(head,n);
        int i = 1;
        ListNode temp = new ListNode();
        temp = head;
        while(temp != null){
            if(cnt == 1) return temp.next;
            if(i == cnt - 1){
                temp.next = temp.next.next;
                break;
            }else{
                i++;
                temp = temp.next;
            }
        }
        return head; 
    }

    public int getN(ListNode head,int n){
        int cnt = 0;
        while(head != null){
            cnt++;
            head = head.next;
        }
        return (cnt - n) + 1;    
    }
}