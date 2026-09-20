class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[] dp = new int[n];

        for (int j = 0; j < n; j++) {
            dp[j] = matrix[n - 1][j];
        }
        for (int i=n - 2;i>=0;i--) {

            int[] curr =new int[n];
            for (int j=0;j<n;j++) {
                int min =dp[j];
                if (j > 0) {
                    min = Math.min(min, dp[j - 1]);
                }
                if (j<n-1) {
                    min = Math.min(min, dp[j + 1]);
                }
                curr[j] = matrix[i][j] + min;
            }
            dp = curr;
        }
        int ans=Integer.MAX_VALUE;
        for (int x : dp) {
            ans = Math.min(ans, x);
        }
        return ans;
    }
}