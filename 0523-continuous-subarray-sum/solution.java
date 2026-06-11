class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> s=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            sum%=k;
            if(sum==0 && i>0){
                return true;
            }
            if(s.containsKey(sum) && i-s.get(sum)>1){
                return true;
            }
            if(!s.containsKey(sum)){
                s.put(sum,i);
            }
        }
        return false;
    }
}
