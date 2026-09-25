class Solution {
    Integer dp[][];
    public int change(int amount, int[] coins) {
        dp=new Integer[coins.length][amount+1];
        return solve(coins,coins.length-1,amount);
    }
    int solve(int arr[],int i,int t){
        if(i==0){
            if(t==0 || t%arr[i]==0){
                return 1;
            }
            return 0;
        }
        if(dp[i][t]!=null){
            return dp[i][t];
        }
        if(t>=arr[i]){
            dp[i][t]=solve(arr,i,t-arr[i])+solve(arr,i-1,t);
        }
        else{
            dp[i][t]=solve(arr,i-1,t);
        }
        return dp[i][t];
    }
}