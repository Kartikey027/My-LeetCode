class Solution {
    public int deleteAndEarn(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+i);
        }
        List<Integer> l=new ArrayList<>(map.keySet());
        Collections.sort(l);
        int p1=0,p2=0,pv=-1;
        for(int i:l){
            int c;
            if(i==pv+1){
                c=Math.max(p1,p2+map.get(i));
            }
            else{
                c=p1+map.get(i);
            }
            p2=p1;
            p1=c;
            pv=i;
        }
        return p1;
    }
}