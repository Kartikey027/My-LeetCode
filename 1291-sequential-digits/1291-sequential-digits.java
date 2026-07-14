class Solution {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> sequentialDigits(int low, int high) {
        for(int i=1;i<=9;i++){
            gene(i,i+1,low,high);
        }
        Collections.sort(ans);
        return ans;
    }
    public void gene(int no,int ne,int low,int high){
        if(ne>9) return;
        else if(no<=high){
            no=no*10+ne;
            ne++;
            if(no<=high && no>=low){
                ans.add(no);
            }
            gene(no,ne,low,high);
        }
    }
}