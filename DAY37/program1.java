// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

//BRUTE FORCE APPROACH
// class Solution {
//     public String firstPalindrome(String[] words) {
//         for(int i=0;i<words.length;i++){
//             String wrd=words[i];
//             String rev="";
//             for(int j=wrd.length()-1;j>=0;j--){
//                  rev+=wrd.charAt(j);
//             }
//             if(rev.equals(wrd)){
//                 return rev;
//             }
//         }
//         return "";
//     }
// }

//OPTIMIZED APPROACH
class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) return word;
        }
        return "";
    }
}
