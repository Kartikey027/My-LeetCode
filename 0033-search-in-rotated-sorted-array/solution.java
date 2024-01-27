class Solution {
    public int search(int[] nums, int target) {
        int pivot=pivot(nums);
        int end,start,mid;
        if(pivot==-1)
        {
            start=0;
            end=nums.length-1;
            while(start<=end)
            {
                mid=start+(end-start)/2;
                if(nums[mid]==target)
                {
                    return mid;
                }
                else if(nums[mid]<target)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        else{
            if(target>=nums[0])
            {
                start=0;
                end=pivot;
                while(start<=end)
                {
                    mid=start+(end-start)/2;
                    if(nums[mid]==target)
                    {
                        return mid;
                    }
                     else if(nums[mid]<target)
                    {
                     start=mid+1;
                    }
                     else
                    {
                    end=mid-1;
                    }
                }
            }
            else
            {
                start=pivot+1;
                end=nums.length-1;
                while(start<=end)
                {
                    mid=start+(end-start)/2;
                    if(nums[mid]==target)
                    {
                        return mid;
                    }
                     else if(nums[mid]<target)
                    {
                        start=mid+1;
                    }
                    else
                    {
                        end=mid-1;
                    }
                }
            }

        }
        return -1;
    }
    int pivot(int[]nums)
    {
        int end,start,mid;
        start=0;
        end=nums.length-1;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            if(nums[mid]<=nums[start])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        return -1;
    }
}
