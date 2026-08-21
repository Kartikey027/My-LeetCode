class Solution {
    int[][] dp;
    Map <Integer,Integer>  stone=new HashMap<>();
    public boolean canCross(int[] stones) {
        int n=stones.length;
        for(int i=0;i<n;i++){
            stone.put(stones[i],i);
        }
        dp=new int[n][n];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return solve(stones[0],0,stones[n-1]);

    }
    public boolean solve(int curr,int jump,int last){
        
        int idx=stone.get(curr);
        boolean c1=false,c2=false,c3=false;
        if(curr==last){
            return true;
        }
        if(dp[idx][jump]!=-1){
            if(dp[idx][jump]==0){
                return false;
            }
            else if(dp[idx][jump]==1){
                return true;
            }
        }
        if(jump>1 && stone.containsKey(curr+jump-1)){

            c1= solve(curr+jump-1,jump-1,last);
        }
        if(jump>=1 && stone.containsKey(curr+jump)){

            c2= solve(curr+jump,jump,last);
        }
        if(stone.containsKey(curr+jump+1)){

            c3= solve(curr+jump+1,jump+1,last);
        }
        boolean res=c1||c2||c3;
        dp[idx][jump]=res?1:0;
        return res;

    }
}