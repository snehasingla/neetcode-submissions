class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0, r= n-1;
        int maxl = height[0] , maxr = height[n-1];
        int res = 0;
        while(l<r){
            if(maxl < maxr){
                l++;
                maxl= Math.max(maxl , height[l]);
                res+= Math.max(0 , maxl - height[l]);
            }

            else{
                r--;
                maxr= Math.max(maxr,height[r]);
                res+= Math.max(0, maxr-height[r]);
            }
        }
        return res;
    }
}
