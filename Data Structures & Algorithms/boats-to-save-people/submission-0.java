class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0 , r = people.length-1;
        int boat=0;

        while(l<=r){
            int rem = limit - people[r];
            r--;
            boat++;

            if(rem >= people[l]){
                l++;
            }
        }
        return boat;
    }
}