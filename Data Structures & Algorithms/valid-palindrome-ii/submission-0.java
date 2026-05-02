class Solution {
    public boolean validPalindrome(String s) {
        int l=0, r=s.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l>r && !Character.isLetterOrDigit(s.charAt(r))) r--;

           if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
            return isPallindrome(s, l+1, r) || isPallindrome(s,l,r-1);
           }
            l++;
            r--;
        }
        return true;
    }

    public boolean isPallindrome(String s, int l, int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}