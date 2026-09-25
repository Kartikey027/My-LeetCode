class Solution {
    Integer dp[][];
    public int minInsertions(String s) {
        dp=new Integer[s.length()][s.length()];
        return solve(s,0,s.length()-1);
    }
    int solve(String s,int i,int j){
        if(i==j || i>j){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]=solve(s,i+1,j-1);
        }
        else{
            dp[i][j]=1+Math.min(solve(s,i+1,j),solve(s,i,j-1));
        }
        return dp[i][j];
    }
}