class Solution {
    public boolean isPalindrome(int x)
     {
        int s,t,n;
        n=x;s=0;
        while(n>0)
        {
            t=n%10;
            n=n/10;
            s=s*10+t;
        }
        if(s==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
