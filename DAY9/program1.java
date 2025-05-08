// Math based 
// https://leetcode.com/problems/nth-digit/description/
class Solution {
    public int findNthDigit(int n) {
        StringBuilder str = new StringBuilder();
        int num = 1;
        while (str.length() < n) {
            str.append(num);
            num++;
        }
        char ch = str.charAt(n - 1);

        return ch - '0';
    }
}
