// Topic: Linked List
// Question Link: https://leetcode.com/problems/palindrome-linked-list/
import java.util.ArrayList;
import java.util.List;
class Solution {
   public boolean isPalindrome(ListNode head) {
    List<Integer> list = new ArrayList<>();

    ListNode current = head;
    while(current != null){
       list.add(current.val);
       current = current.next;
    }
    int i=0;
    int j = list.size()-1;
    while(i<j){
       if(!list.get(i).equals(list.get(j))){
           return false;
       }
       i++;
       j--;
    }
    return true;
   }
}
