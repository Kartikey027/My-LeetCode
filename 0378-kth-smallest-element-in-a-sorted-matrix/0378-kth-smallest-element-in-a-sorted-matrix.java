class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                q.offer(matrix[i][j]);
                if(q.size()>k){
                    q.poll();
                }
            }
        }
        return q.poll();
    }
}