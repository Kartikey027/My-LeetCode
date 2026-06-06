class Solution {
    public int minStartValue(int[] nums) {
        int minsum=nums[0];
        int sum=0;
        for(int i:nums){
            sum+=i;
            minsum=Math.min(minsum,sum);
        }
        if(minsum>0){
            return 1;
        }
        else{
            return Math.abs(minsum)+1;
        }
    }
}
