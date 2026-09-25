class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int rem[]=new int[k];
        rem[0]=1;
        int sum=0,count=0;
        for(int i:nums){
            sum+=i;
            count+=rem[(((sum-k)%k)+k)%k];
            rem[(((sum-k)%k)+k)%k]++;
        }
        return count;
    }
}