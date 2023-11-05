class Solution {
    public boolean isHappy(int n) {
        int j=0;
        while(j++ < 15)
        {
            int sum=0;
            while(n!=0)
            {
                int num=n%10;
                sum+=num*num;
                n/=10;
            }
            if(sum==1) return true;

            n=sum;
        }
        return false;
    }
}
