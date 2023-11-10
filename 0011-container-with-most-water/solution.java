class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left,right;
        left=0;
        right=height.length-1;
        while(left<=right)
        {
            if(Math.min(height[left],height[right])*(right-left)>max){
            max=Math.min(height[left],height[right])*(right-left);
            }
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
