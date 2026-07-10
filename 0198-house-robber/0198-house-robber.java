class Solution {
    public int rob(int[] nums) {
        int best=0;
        int prev=0;
        for(int i:nums){
            int temp=best;
            if(prev+i>best){
                best=prev+i;
            }
            prev=temp;
        }
        return best;
    }
}