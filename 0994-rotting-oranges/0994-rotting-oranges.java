class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int f=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    f++;
                }
                else if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int dir[][]={
                {0,1},{0,-1},{1,0},{-1,0}
            };
            int time=0;
            while(!q.isEmpty()){
                int size=q.size();
                boolean flag=false;
                for(int w=0;w<size;w++){
                    int[] x=q.poll();
                    for(int d[]:dir){
                        int g=x[0]+d[0];
                        int h=x[1]+d[1];

                        if(g<m && g>=0 && h<n && h>=0 && grid[g][h]==1){
                            grid[g][h]=2;
                            f--;
                            flag=true;
                            q.add(new int[]{g,h});
                        }
                    }
                }
                if(flag){
                    time++;
                }
            }

        if(f==0){
            return time;
        }
        else{
            return -1;
        }
    }
}