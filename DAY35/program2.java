// https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int countSegments(String s) {
        if (s == null || s.trim().equals("")) return 0;

        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
                count++;

        return count;
    }
}
        // if(s==null || s.equals(""))
        // return 0;

        // String [] arr=s.split(" ");
        // return arr.length;
