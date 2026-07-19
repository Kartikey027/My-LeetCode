class Solution {
    int dp[];
    public int numDecodings(String s) {
        if(s.charAt(0)=='0') return 0;
        dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return solve(s,0);
    }
    public int solve(String s,int i){
        if(i==s.length()) return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=-1) return dp[i];
        int ways=solve(s,i+1);
        if (i + 1 < s.length() && (s.charAt(i)=='1' || (s.charAt(i)=='2' && s.charAt(i+1)<='6'))){
            ways+=solve(s,i+2);
        }
        dp[i]=ways;
        return ways;
    }
}