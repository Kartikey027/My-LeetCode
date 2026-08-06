class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        int t=1;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(temp[i])==false){
                map.put(temp[i],t);
                t++;
            }
        }
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}