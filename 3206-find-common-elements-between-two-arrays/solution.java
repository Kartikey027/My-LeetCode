class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int res[]={0,0};
        for(int i:nums1){
            boolean flag=false;
            for(int x:nums2){
                if(i==x){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                res[0]+=1;
            }
        }
        for(int i:nums2){
            boolean flag=false;
            for(int x:nums1){
                if(i==x){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                res[1]+=1;
            }
        }
        return res;
    }
}

