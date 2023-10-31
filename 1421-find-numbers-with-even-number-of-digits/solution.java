class Solution {
    public int findNumbers(int[] nums) {
        int i,x,n,t;
        t=0;
        for(i=0;i<nums.length;i++)
        {
            x=0;
            n=nums[i];
            while(n>0)
            {
                n/=10;
                x++;
            }
            if(x%2==0)
            t++;
        }
        return (t);
    }
}
