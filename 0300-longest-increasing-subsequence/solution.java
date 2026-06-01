class Solution {
    public int lengthOfLIS(int[] nums) {
        int a[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=1;
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    a[i]=Math.max(a[i],a[j]+1);
                }
            }
            ans=Math.max(ans,a[i]);
        }
        return ans;
    }
}
