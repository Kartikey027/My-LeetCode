class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre[]=new int[nums.length];
        int suf[]=new int[nums.length];
        int pro=1;
        for(int i=0;i<nums.length;i++){
            pre[i]=pro;
            pro*=nums[i];
        }
        pro=1;
        for(int i=nums.length-1;i>=0;i--){
            suf[i]=pro;
            pro*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            pre[i]*=suf[i];
        }
        return pre;
    }
}