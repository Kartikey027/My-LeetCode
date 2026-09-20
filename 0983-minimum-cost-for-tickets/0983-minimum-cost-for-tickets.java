class Solution {
    public int mincostTickets(int[] days, int[] cost) {
        int dp[]=new int[days.length];
        Arrays.fill(dp,-1);
        return solve(0,days,cost,dp);
    }
    public int solve(int i,int[] days,int[] cost, int[] dp){
        if(i>=days.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int n1=i+1;

        int n7=i;
        while(n7<days.length && days[n7]<days[i]+7){
            n7++;
        }

        int n30=i;
        while(n30<days.length && days[n30]<days[i]+30){
            n30++;
        }

        int one=cost[0]+solve(n1,days,cost,dp);
        int seven=cost[1]+solve(n7,days,cost,dp);
        int thirty=cost[2]+solve(n30,days,cost,dp);

        dp[i]=Math.min(one,Math.min(seven,thirty));
        return dp[i];
    }
}