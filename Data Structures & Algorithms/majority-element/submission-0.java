class Solution {
    public int majorityElement(int[] nums) {
        //using hashmaps
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> en : map.entrySet()){
            if(en.getValue() > n/2){
                return en.getKey();
            }
        }

        return -1;
    }
}