class Solution {
    public int majorityElement(int[] nums) {
        //Moore's voting algo
        int elem=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                elem = nums[i];
                count=1;
            }
            else if(nums[i] == elem) count++;
            else count--;
        }

        return elem;
    }
}