class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int pr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            pr[i][0]=speed[i];
            pr[i][1]=efficiency[i];
        }
        Arrays.sort(pr,(a,b)->Integer.compare(b[1],a[1]));
        Queue<Integer> min=new PriorityQueue<>();
        long sum=0,ans=0;
        for(int i[]:pr){
            min.offer(i[0]);
            sum+=i[0];
            if(min.size()>k){
                sum-=min.poll();
            }
            if(min.size()<=k){
                ans=Math.max(ans,sum*i[1]);
            }
        }
        return (int)(ans % 1000000007);
    }
}