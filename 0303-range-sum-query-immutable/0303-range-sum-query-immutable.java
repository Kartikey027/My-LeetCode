class NumArray {
    int nums[];
    Map<Integer,Integer> map;
    public NumArray(int[] nums) {
     this.nums=nums;
     map=new HashMap<>();  
     int sum=0;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        map.put(i,sum);
     } 
    }
    
    public int sumRange(int left, int right) {
        int sol=map.get(right);
        for(int i=left-1;i>=0;i--){
            sol-=nums[i];
        }
        return sol;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */