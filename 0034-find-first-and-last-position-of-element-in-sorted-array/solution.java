class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        ans[0]=first(nums,target);
        ans[1]=last(nums,target);
        return ans;
    }
    int first(int []arr,int x)
    {
        int  lo=0;int hi=arr.length-1;
    int ans=-1;
    while(lo<=hi){
        int mid=lo+(hi-lo) /2;
        if(arr[mid]>=x)
        {
            if(arr[mid]==x)
            ans=mid;
            hi=mid-1;
        }
        else{
            lo=mid+1;
        }
    }
    return ans;
    }

    int last(int a[], int x)
    {
        int lo=0;int hi=a.length-1;
        int ans=-1;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(a[mid]<=x)
            {
                if(a[mid]==x)
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
}
