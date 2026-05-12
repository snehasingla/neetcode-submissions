class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->b-a);

        for(int num : stones){
            pq.add(num);
        }

        while(pq.size()>=2){
            int t1 = pq.poll();
            int t2 = pq.poll();
            if(t1==t2) continue;
            if(t1>t2){
                pq.add(t1 - t2);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();

    }
}
