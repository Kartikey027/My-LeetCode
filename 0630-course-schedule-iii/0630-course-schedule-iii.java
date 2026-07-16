class Solution {
    public int scheduleCourse(int[][] courses) {
        Queue<Integer> q=new PriorityQueue<>((a,b)->Integer.compare(b,a));
        Arrays.sort(courses,(a,b)->Integer.compare(a[1],b[1]));
        int time=0;
        for(int i[]:courses){
            if(q.isEmpty()){
                if(i[0]<=i[1])
                q.add(i[0]);
                time+=i[0];
            }
            else{
                if(time+i[0]<=i[1]){
                    q.add(i[0]);
                    time+=i[0];
                }else{
                    if(i[0]<q.peek()){
                        time-=q.poll();
                        q.add(i[0]);
                        time+=i[0];
                    }
                }
            }
        }
        return q.size();
    }
}