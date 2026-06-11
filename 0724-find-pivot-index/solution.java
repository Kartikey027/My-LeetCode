class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumL=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++){
            sumL[i]=s;
            s+=nums[i];
        }
        int[] sumR=new int[nums.length];
        s=0;
        for(int i=nums.length-1;i>=0;i--){
            sumR[i]=s;
            s+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(sumL[i]==sumR[i]){
                return i;
            }
        }
        return -1;
    }
}
