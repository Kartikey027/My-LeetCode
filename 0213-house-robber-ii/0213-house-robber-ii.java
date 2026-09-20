class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums.length==1){
            return nums[0];
        }
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int c1=solve(nums,0,n-2,dp1);
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int c2=solve(nums,1,n-1,dp2);
        return Math.max(c1,c2);

    }
    public int solve(int[] nums,int s,int e,int[] dp){
        if(s>e){
            return 0;
        }
        if (dp[s] != -1) {
            return dp[s];
        }
        int rob=nums[s]+solve(nums,s+2,e,dp);
        int skip=solve(nums,s+1,e,dp);
        dp[s]= Math.max(rob,skip);
        return dp[s];

    }
}