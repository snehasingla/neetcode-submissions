class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st= new Stack<>();
        //int[] res= new int[asteroids.length];

        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0) st.push(asteroids[i]);
            else{
            while(!st.isEmpty() && asteroids[i]<0 && st.peek()>0 && Math.abs(asteroids[i])> st.peek()){
                st.pop();
            }

                if(!st.isEmpty() && Math.abs(asteroids[i])==st.peek()){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0){
                    st.push(asteroids[i]);
                }
            
            }
        }

       int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }
}