class Solution {
    public int removeCoveredIntervals(int[][] interval) {
        int ans=interval.length;
        Arrays.sort(interval, (a, b) -> {
            if (a[0] != b[0]){
                return a[0] - b[0];
            }
            return b[1] - a[1];
        });
        int low=interval[0][0];
        int high=interval[0][1];
        for(int i=1;i<interval.length;i++){
            if(interval[i][0]==low || interval[i][1]<=high){
                ans--;
            }else{
                low=interval[i][0];
                high=interval[i][1];
            }
        }
        return ans;
    }
}