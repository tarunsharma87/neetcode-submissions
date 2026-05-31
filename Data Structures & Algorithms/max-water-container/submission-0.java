class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length-1;
        int result = 0;

        while (start < end) {
            int area = (end-start)*Math.min(heights[start], heights[end]);
            result = area > result ? area : result;

            if (heights[start] > heights[end]) {
                end--;
            } else {
                start++;
            }
        }
        return result;
    }
}
