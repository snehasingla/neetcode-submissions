class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }

        while(!pq.isEmpty()){
            int elem= pq.poll();
            k--;
            if(k==0) return elem;
        }
        return 0;
    }
}
