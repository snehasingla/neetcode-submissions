class Solution {
    //BRUTE FORCE
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                int area= Math.min(heights[i] , heights[j])  * (j-i);
                max=Math.max(max,area);
            }
        }
        return max;
    }
}
