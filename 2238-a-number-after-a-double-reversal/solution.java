class Solution {
    public boolean isSameAfterReversals(int num) {
        int x,rev,rev1,t;
        rev=0;
        rev1=0;
        t=num;
        while(t>0)
        {
            x=t%10;
            t/=10;
            rev=rev*10 + x;
        }
        t=rev;
        while(t>0)
        {
            x=t%10;
            t/=10;
            rev1=rev1*10 + x;
        }
        if(rev1==num) return true;
        else return false;
    }
}
