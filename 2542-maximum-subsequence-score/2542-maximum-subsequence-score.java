class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int pr[][]=new int[nums1.length][2];
        for(int i=0;i<nums1.length;i++){
            pr[i][0]=nums1[i];
            pr[i][1]=nums2[i];
        }
        Arrays.sort(pr,(a,b)->Integer.compare(b[1],a[1]));
        long sum=0,ans=0;
        Queue<Integer> min=new PriorityQueue<>();
        for(int i=0;i<pr.length;i++){
            min.add(pr[i][0]);
            sum+=pr[i][0];

            if(min.size()>k){
                sum-=min.poll();
            }

            if(min.size()==k){
                ans=Math.max(ans,sum*pr[i][1]);
            }
            
        }
        return ans;
    }
}