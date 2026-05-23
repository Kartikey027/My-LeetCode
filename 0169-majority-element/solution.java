class Solution {
    public int majorityElement(int[] nums) {
        int a,x;
        a=x=0;
        for(int i:nums){
            if(a==0){
                x=i;
            }
            if(i==x){
                a++;
            }else{
                a--;
            }

        }
        return x;
    }
}
