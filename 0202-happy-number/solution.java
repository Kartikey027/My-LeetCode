class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visit=new HashSet<>();
        while(!visit.contains(n)){
            visit.add(n);
            n=sq(n);
            if(n==1) return true;
        }
        return false;
        
    }
    public int sq(int a){
        int ans=0;
        while(a>0){
            int x=a%10;
            ans+=x*x;
            a=a/10;
        }
        return ans;
    }
}
