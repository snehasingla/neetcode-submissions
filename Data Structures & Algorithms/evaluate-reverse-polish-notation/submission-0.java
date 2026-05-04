class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int t1= st.pop();
                int t2= st.pop();
                int ans= t1+t2;
                st.push(ans);
            }
            else if(tokens[i].equals("*")){
                int t1= st.pop();
                int t2= st.pop();
                int ans= t1*t2;
                st.push(ans);
            }
            else if(tokens[i].equals("-")){
                int t1= st.pop();
                int t2= st.pop();
                int ans= t2-t1;
                st.push(ans);
            }
            else if(tokens[i].equals("/")){
                int t1= st.pop();
                int t2= st.pop();
                int ans= t2/t1;
                st.push(ans);
            }
            else st.push(Integer.parseInt(tokens[i]));
        }

        return st.peek();
    }
}
