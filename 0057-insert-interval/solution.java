class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> a=new ArrayList<>();
        for(int[] x:intervals){
            if(newInterval[1]<x[0]){
                a.add(newInterval);
                newInterval=x;
            }
            else if(x[1]<newInterval[0]){
                a.add(x);
            }
            else{
                newInterval[0]=Math.min(newInterval[0],x[0]);
                newInterval[1]=Math.max(newInterval[1],x[1]);
            }
        }
        a.add(newInterval);

        return a.toArray(new int[a.size()][]);
    }
}
