// Easy DSA
// https://leetcode.com/problems/majority-element/description/
class Solution {
    public int majorityElement(int[] nums) {
       int freq=0,ans=0;
       for(int i=0;i<nums.length;i++){
        if(freq==0 || ans==nums[i]){
            ans=nums[i];
            freq++;
        }
        else{
            freq--;
        }
       }
       return ans;
    }
}