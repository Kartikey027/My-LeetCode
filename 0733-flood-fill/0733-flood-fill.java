class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int r = image.length;
        int c = image[0].length;

        int org = image[sr][sc];

        if(org == color) return image;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr, sc});
        image[sr][sc] = color;

        int[][] dir = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        while(!q.isEmpty()) {
            int a[] = q.poll();

            for(int d[] : dir) {
                int nr = a[0] + d[0];
                int nc = a[1] + d[1];

                if(nr >= 0 && nr < r && nc >= 0 && nc < c 
                   && image[nr][nc] == org) {
                    
                    image[nr][nc] = color;
                    q.add(new int[]{nr,nc});
                }
            }
        }

        return image;
    }
}