// https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int lengthOfLastWord(String s) {
        String [] arr=s.split(" ");
                int len=arr.length;
        String str=arr[len-1];
        return str.length();
       
    }
}