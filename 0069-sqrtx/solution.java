class Solution
{
    public int mySqrt(int x) 
    {
        if(x==0 || x==1)
        return x;

        int min=1;
        int max=x;
        int mid;
        while(min<=max){
            mid=min + (max-min)/2;
            if((long)mid*mid > (long)x)
             max=mid-1;
            else if(mid*mid==x)
             return mid;
            else
             min = mid+1;  
        }
        return Math.round(max);
    }
}
