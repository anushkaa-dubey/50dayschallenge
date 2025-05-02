//Topic: Linked List
// Question Link: https://leetcode.com/problems/merge-two-sorted-lists/
class PerfectNumberValidator {
    public boolean checkPerfectNumber(int num) {
     int sum=0;
     for(int i=1;i<num;i++){
        if(num%i==0){
            sum+=i;
        }
     }   
     return num == sum;
    }
}