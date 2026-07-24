class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int dp[][]=new int[m][n];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    dp[i][j]=0;
                    q.offer(new int[]{i,j});
                }
            }
        }
        int dir[][]={
                {1,0},
                {-1,0},
                {0,1},
                {0,-1}
            };
        while(!q.isEmpty()){
            int cur[]=q.poll();
            for(int i[]:dir){
                int r=cur[0]+i[0];
                int c=cur[1]+i[1];
                if(r<m && r>=0 && c<n && c>=0){
                    if(dp[r][c]==-1){
                        dp[r][c] = dp[cur[0]][cur[1]] + 1;
                        q.offer(new int[]{r,c});
                    }
                }
            }
        }
        return dp;

    }
}