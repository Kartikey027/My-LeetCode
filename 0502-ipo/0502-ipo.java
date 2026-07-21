class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int pr[][]=new int[capital.length][2];
        for(int i=0;i<capital.length;i++){
            pr[i][0]=capital[i];
            pr[i][1]=profits[i];
        }
        Arrays.sort(pr,(a,b)->Integer.compare(a[0],b[0]));
        Queue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        int d=0;
        for(int i=0;i<k;i++){
            while(d<capital.length && pr[d][0]<=w){
                max.offer(pr[d][1]);
                d++;
            }
            if(max.isEmpty()){
                break;
            }
            w+=max.poll();
        }
        return w;
    }
}