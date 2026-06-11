class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> s=new HashMap<>();
        int count=0;
        s.put(0,1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           if(s.containsKey(sum-k)){
            count+=s.get(sum-k);
           }
           s.put(sum,s.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
