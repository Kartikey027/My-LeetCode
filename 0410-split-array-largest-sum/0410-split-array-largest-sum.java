class Solution {
    public int splitArray(int[] nums, int k) {
        int min=0,sum=0;
        for(int i:nums){
            if(min<i){
                min=i;
            }
            sum+=min;

        }
        int mid=0,ans=0;
        while(min<=sum){
            mid=min+(sum-min)/2;
            int x=cond(nums,mid);
            if(x>k){
                min=mid+1;
            }
            if(x<=k){
                ans=mid;
                sum=mid-1;
            }

        }
        return ans;
    }
    public int cond(int n[],int m){
        int sum=0;
        int a=1;
        for(int i:n){
            if(sum+i > m){
                a++;
                sum=i;
            }else{
                sum+=i;
            }
        }
        return a;
    }
}