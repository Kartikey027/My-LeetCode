class Solution {
    public int mySqrt(int x) {
        int end,start;
        start=1;
        end=x;
        while(start<=end)
        {
            long mid=start+(end-start)/2;
            long z=mid*mid;
            if(z==x || (z<x && (mid+1)*(mid+1)>x))
             return (int)mid;
            else if(z>x) end=(int)mid-1;
            else start=(int)mid+1;
        }
        return 0;
    }
}
