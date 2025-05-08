// DSA based 
// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode tempS=head;
        ListNode tempE=head;
        int n=0, mark=0;
        //find length
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        for(int i=1;i<k;i++){
            tempS = tempS.next;
        }
        for(int i = 1; i < n - k + 1; i++) {
            tempE = tempE.next;
        }
        mark = tempS.val;
        tempS.val = tempE.val;
        tempE.val=mark;

        return head;

    }
}