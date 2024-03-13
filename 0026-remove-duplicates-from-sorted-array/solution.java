class Solution {
    public int removeDuplicates(int[] a) {
        int l=a.length;
        int i=0;
        for(int j=1;j<l;j++)
        {
            if(a[i]!=a[j])
            {
                i++;
                a[i]=a[j];
            }
        }
        return i+1;
    }
}
