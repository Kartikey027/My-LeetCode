class Solution {
    public int maxArea(int[] height) {
        int right,left,max;
        left=0;
        right=height.length-1;
        max=0;
        while(left<right){
            int temp=(right-left)* Math.min(height[left],height[right]);
            max=Math.max(temp,max);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
