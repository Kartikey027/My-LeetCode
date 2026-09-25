class Solution {
    Integer dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new Integer[text1.length()][text2.length()];

        return solve(text1,text2,text1.length()-1,text2.length()-1);
    }
    int solve(String t1,String t2,int i,int j){
       if(i<0 || j<0){
        return 0;
       }
       if(dp[i][j]!=null){
        return dp[i][j];
       }
       if(t1.charAt(i)==t2.charAt(j)){
        dp[i][j]=1+solve(t1,t2,i-1,j-1);
       }
       else{
        dp[i][j]=Math.max(solve(t1,t2,i-1,j),solve(t1,t2,i,j-1));
       }
       return dp[i][j];
    }
}