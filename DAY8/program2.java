// Math Based Day 8
// https://leetcode.com/problems/excel-sheet-column-number/description/
class Solution {
    public int titleToNumber(String columnTitle) {
        int len=columnTitle.length();
        int sum=0;
        for(int i=0;i<len;i++){
         sum=sum + ((((int)columnTitle.charAt(i))-64) * ((int)Math.pow(26,len-1-i)));
        }
        return sum;
    }
}