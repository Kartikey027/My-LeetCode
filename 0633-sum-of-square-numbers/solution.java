
class Solution {
    public boolean judgeSquareSum(int c) {
        long start,end;
        start=0;
        end=(int)Math.sqrt(c);
        while(start<=end)
        {
            long mid=start*start + end*end;
            if(mid==c) return true;
            else if(mid<c) start++;
            else end--;
        }
        return false;
    }
}
