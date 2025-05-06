// DSA
// https://leetcode.com/problems/rotate-list/description/
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = getLength(head);
        k = k % length;  
        if (k == 0) {
            return head;
        }
        head = reverseBetween(head, 1, length);
        head = reverseBetween(head, 1, k);
        head = reverseBetween(head, k + 1, length);
        return head;
    }
    private int getLength(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
    private ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        ListNode current = prev.next;
        ListNode next = null;
        for (int i = 0; i < right - left; i++) {
            next = current.next;
            current.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;

    }
}