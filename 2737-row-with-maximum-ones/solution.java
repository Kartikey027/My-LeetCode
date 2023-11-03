class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int a[]=new int[2];
        int i,j,mc,c;
        c=0;mc=0;
        for(i=0;i<mat.length;i++)
        {
            for(j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                c++;
            }
            if(c>mc)
            {
                mc=c;
                a[0]=i;
            }
            c=0;
            a[1]=mc;
        }
        return a;     
    }
}
