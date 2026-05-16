class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> pq= new PriorityQueue<>((d,e)-> e[1]-d[1]);  //char,freq

        if(a>0) pq.add(new int[]{'a',a}); //here a,b,c are numbers given in que that are basically freq that tells atmost this no of times a char can come in final ans
        if(b>0) pq.add(new int[]{'b',b});
        if(c>0) pq.add(new int[]{'c',c});

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            char ch = (char) curr[0];
            int freq= curr[1];
            int len= sb.length();

            if(sb.length()>=2 && sb.charAt(len-1)==ch && sb.charAt(len-2) == ch){
                if(pq.isEmpty()) break;
                int[] second = pq.poll();
                sb.append((char) second[0]);
                second[1]--;

                if(second[1] > 0) pq.offer(new int[]{second[0], second[1]});
                pq.offer(curr);
            }

            else{
                sb.append(ch);
                freq--;
                if(freq>0) pq.offer(new int[]{ch,freq});
            }
        }

        return sb.toString();
    }
}