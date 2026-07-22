class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        k%=m*n;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++){
                int idx=i*n+j;
                int newidx=(idx-k+(m*n))%(m*n);
                temp.add(grid[newidx/n][newidx%n]);
            }
            ans.add(temp);
        }
        return ans;
    }
}