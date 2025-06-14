// https://leetcode.com/problems/find-center-of-star-graph/description/
public int findCenter(int[][] e) {
    return e[0][0] == e[1][0] || e[0][0] == e[1][1] ? e[0][0] : e[0][1];
}