class Solution {
    int dp[][];
    public int uniquePathsWithObstacles(int[][] og) {
        dp=new int[og.length][og[0].length];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return solve(0,0,og);
    }
    public int solve(int i,int j,int og[][]){
        if(i>=og.length || j>=og[0].length){
            return 0;
        }
         if(og[i][j]==1){
            return 0;
        }
        if(i==og.length-1 && j==og[0].length-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        dp[i][j]=solve(i+1,j,og)+solve(i,j+1,og);
        return dp[i][j];

    }
}