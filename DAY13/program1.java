// DSA based 
// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode temp = head;        
        ListNode prev = new ListNode(-1);
        prev.next = head;
        boolean flag = false;

        ListNode dummy = prev;

        while(temp!=null && temp.next!=null){

            while(temp.next != null && temp.val == temp.next.val){
                temp.next = temp.next.next;
                flag = true;                
            }

            if(flag){
                prev.next = temp.next;
                temp = prev.next;
                flag = false;
            }else{
                prev = temp;
                temp = temp.next;
            }
        }

        return dummy.next;
    }
}