// Easy DSA
// https://leetcode.com/problems/pascals-triangle-ii/description/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(1);
        }
        final var prev = getRow(rowIndex - 1);
        final var len = rowIndex + 1;
        final List<Integer> row = new ArrayList<>(len);
        row.add(1);
        for (int i = 1; i < len - 1; i++) {
            row.add(prev.get(i - 1) + prev.get(i));
        }
        row.add(1);
        return row;
    }
}