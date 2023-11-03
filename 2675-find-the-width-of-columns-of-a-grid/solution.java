class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int len,max,i,j;max=0;
        int a[]=new int[grid[0].length];
        for(i=0;i<grid[0].length;i++)
        {
            for(j=0;j<grid.length;j++)
            {
                int n=grid[j][i];
                len=String.valueOf(n).length();
                if(max<len)
                max=len;
            }
            a[i]=max;
            max=0;
        }
        return a;
    }
}
