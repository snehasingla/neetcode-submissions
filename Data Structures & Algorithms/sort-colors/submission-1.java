class Solution {
    public void sortColors(int[] nums) {
        //dutch flag algorithm
        int low=0, mid=0, high= nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;                                    //here we will not do mid++ because we don't know what is the elem it can be either 0 or 1 at high which we have swapped with mid so have to recheck the mid elem whether its 0 or 1;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }
}