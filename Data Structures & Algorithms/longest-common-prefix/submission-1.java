class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n= strs.length;
        String s1= strs[0];
        String s2= strs[n-1];
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)== s2.charAt(j)){
                sb.append(s1.charAt(i));
                i++;
                j++;
            }
            else break;
        }

        return sb.toString();

    }
}