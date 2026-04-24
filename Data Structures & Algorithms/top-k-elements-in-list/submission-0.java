class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();

        //count freq of every elem and store in map
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        //converting map to list so that we can apply sorting based on frequencies
        List<int[]> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> en : map.entrySet()){
            arr.add(new int[] {en.getValue(), en.getKey()});
        }

        arr.sort((a,b)->b[0]-a[0]);

        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]= arr.get(i)[1];
        }
        return res;
    }
}
