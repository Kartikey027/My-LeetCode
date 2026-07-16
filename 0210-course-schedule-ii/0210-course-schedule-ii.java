class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int p[]:prerequisites){
            adj.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        List<Integer> res=new ArrayList<>();
        while(!q.isEmpty()){
            int n=q.poll();
            res.add(n);
            for(int nei:adj.get(n)){
                indegree[nei]--;
                if(indegree[nei]==0){
                    q.add(nei);
                }
            }
        }
        if(res.size()!=numCourses){
            return new int[0];
        }
        else{
            int r[]=new int[numCourses];
            for(int i=0;i<numCourses;i++){
                r[i]=res.get(i);
            }
            return r;
        }

    }
}