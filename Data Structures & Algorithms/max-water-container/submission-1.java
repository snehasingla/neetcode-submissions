class Solution {
    public int maxArea(int[] heights) {
        int l=0, r=heights.length-1;
        int maxarea= Integer.MIN_VALUE;
        while(l<r){
            int area= Math.min(heights[l] , heights[r]) * (r-l);
            maxarea = Math.max(area , maxarea);

            if(heights[l]<heights[r]) l++;
            else r--;
        }
        return maxarea;
    }
}
