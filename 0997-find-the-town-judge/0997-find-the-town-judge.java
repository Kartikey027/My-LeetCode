class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1) return n;
        Map<Integer,List<Integer>> m=new HashMap<>();
        int o[]=new int[n+1];
        for(int i=1;i<=n;i++){
            m.put(i,new ArrayList<>());
            o[i]=0;
        }
        for(int i[]:trust){
            List<Integer> t=m.get(i[1]);
            t.add(i[0]);
            m.put(i[1],t);
            o[i[0]]+=1;
        }
        for(int i=1;i<=n;i++){
            List<Integer> t=m.get(i);
            if(o[i]==0 && t.size()==n-1){
                return i;
            }
        }
        return -1;

    }
}