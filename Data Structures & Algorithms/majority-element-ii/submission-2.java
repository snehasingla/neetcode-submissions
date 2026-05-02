class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0;
        int count2=0;
        int elem1=-1;
        int elem2=-1;
        int n=nums.length;

        for(int num:nums){
            if(num == elem1){
                count1++;
            }
            else if(num == elem2){
                count2++;
            }
            else if(count1 ==0){
                elem1 = num;
                count1 = 1;
            }
            else if(count2 == 0){
                elem2 = num;
                count2= 1;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        List<Integer> ls= new ArrayList<>();
        for(int num:nums){
            if(num==elem1) count1++;
            else if(num==elem2) count2++;
        }

        if(count1> n/3) ls.add(elem1);
        if(count2 > n/3) ls.add(elem2);
        return ls;
    }
}