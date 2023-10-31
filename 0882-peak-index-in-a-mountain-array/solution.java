class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i,max,o;
        o=0;
        max=arr[0];
        for(i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                o=i;
            }
        }
        return (o);
    }
}
