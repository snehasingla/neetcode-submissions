class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n= nums.length;
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> en : map.entrySet()){
            if(en.getValue()>n/3){
                ls.add(en.getKey());
            }
        }

        return ls;
    }
}