class Solution
{
    public int[] twoSum(int[] nums, int target) 
    {
        int size=nums.length;
        int a[]=new int[2];
         int i,j,sum;
         for(i=0;i<size;i++)
         {   
            for(j=i+1;j<size;j++)
            {
                sum=nums[i]+nums[j];
                if(sum==target)
                {
                    a[0]=i;
                    a[1]=j;
                }
                
            }
         }
     return a; }

}
