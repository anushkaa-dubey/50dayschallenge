// Topic: Math based
// Link: https://leetcode.com/problems/missing-number/
class Solution {
    public int missingNumber(int[] nums) {
    int len = nums.length;
    int sum = (0+len)*(len+1)/2;
    for(int i=0; i<len; i++)
        sum-=nums[i];
    return sum;
}
}