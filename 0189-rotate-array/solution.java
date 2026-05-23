class Solution {
    public void rotate(int[] nums, int k) {
       int x=k%nums.length;
       reverse(nums,0,nums.length-1);
       reverse(nums,0,x-1);
       reverse(nums,x,nums.length-1);
    }


public void reverse(int nums[],int start,int end){
    while(start<end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }
}
}
