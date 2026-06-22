class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min=0,sum=0;
        for(int i:weights){
            if(min<i){
                min=i;
            }
            sum+=i; 
        }
            int mid=0;
            int ans=0;
            while(min<=sum){
                mid=min+(sum-min)/2;
                int x=cond(weights,mid);
                if(x>days){
                    min=mid+1;
                }
                if(x<=days){
                    ans=mid;
                    sum=mid-1;
                }
            }
        return ans;

    }
    public int cond(int[] w, int m) {
        int days = 1;
        int sum = 0;

        for (int i : w) {
            if (sum + i > m) {
                days++;
                sum = i;
            } else {
                sum += i;
            }
        }
        return days;
}
}