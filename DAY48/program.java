// https://leetcode.com/problems/check-if-it-is-a-good-array/description/
class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()<=1)
           return "";
        char[] arr = palindrome.toCharArray();
        
        for(int i=0; i<arr.length/2;i++){ 
           if(arr[i] != 'a'){ // if not a then change it to be lexographically smallest
               arr[i] = 'a';
               return String.valueOf(arr);
           }
        }
        arr[arr.length-1] = 'b';
        return String.valueOf(arr);
    }
}