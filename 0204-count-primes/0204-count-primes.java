class Solution {
    public int countPrimes(int n) {
        if(n<=1){
            return 0;
        }
        boolean p[]=new boolean[n];
        Arrays.fill(p,true);
        p[0]=false;
        p[1]=false;
        for(int i=2;i*i<n;i++){
            if(p[i]==true){
                int x=i*i;
                while(x<n){
                    p[x]=false;
                    x+=i;
                }
            }
        }
        int c=0;
        for(boolean i:p){
            if(i){
                c++;
            }
        }
        return c;
    }
}