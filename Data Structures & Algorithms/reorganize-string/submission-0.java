class Solution {
    public String reorganizeString(String s) {
        //calc freq of every character
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)-> b[1]-a[1]);
        for(char ch : map.keySet()){
            pq.add(new int[]{ch,map.get(ch)});
        }

        StringBuilder sb = new StringBuilder();
        int[] prev= null;
        while(!pq.isEmpty()){
            int[] curr= pq.poll();
            char ch = (char) curr[0];
            int freq = curr[1];

            sb.append(ch);
            freq--;

            if(prev!=null && prev[1] > 0){
                pq.offer(prev);
            }

            prev = new int[]{ch, freq};
        }

        if(sb.length() != s.length()) return "";
        return sb.toString();
    }
}