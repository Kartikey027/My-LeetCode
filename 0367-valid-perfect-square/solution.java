class Solution {
    public boolean isPerfectSquare(int num) {
        int end,start;
        start=1;
        end=num;
        while(start<=end)
        {
            long mid=start+(end-start)/2;
            long z=mid*mid;
            if(z==num) return true;
            else if(z < num) start=(int)mid+1;
            else end=(int)mid-1;
        }
        return false;
    }
}
