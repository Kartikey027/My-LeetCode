class Solution {
    int[][]dp;
    public int minDistance(String word1, String word2) {
        dp=new int[word1.length()][word2.length()];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return solve(word1,word2,word1.length()-1,word2.length()-1);
    }
    public int solve(String w1,String w2,int i,int j){
        if(i==-1) return j+1;
        if(j==-1) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];

        if(w1.charAt(i)==w2.charAt(j)){
            dp[i][j]=solve(w1,w2,i-1,j-1);
            return dp[i][j];
        }
        
        int ans= Math.min(Math.min(solve(w1,w2,i-1,j),solve(w1,w2,i,j-1)),solve(w1,w2,i-1,j-1)) + 1;
        dp[i][j]=ans;
        return ans;
    }
}