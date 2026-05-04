class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st= new Stack<>();

        for(String s : operations){
            if(s.equals("+")){
                int top = st.pop();
                int secondtop = st.peek();
                int res= top + secondtop;
                st.push(top);
                st.push(res);

            }

            else if(s.equals("D")){
                int res = 2* (st.peek());
                st.push(res);

            }

            else if(s.equals("C")){
               st.pop();
            }
            else {
                int num= Integer.parseInt(s);
                st.push(num);

            }
        }

        int ans=0;
        for(int score : st) ans += score;
        return ans;
    }
}