class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int dp[][]=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==0){
                    dp[i][j]=matrix[i][j];
                }
                else if(j==0){
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j+1])+matrix[i][j];
                }
                else if(j==matrix.length-1){
                    dp[i][j]=Math.min(dp[i-1][j-1],dp[i-1][j])+matrix[i][j];
                }
                else{
                    dp[i][j]=Math.min(dp[i-1][j+1],Math.min(dp[i-1][j-1],dp[i-1][j]))+matrix[i][j];
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i:dp[dp.length-1]){
            if(i<min) min=i;
        }
        return min;
    }
}