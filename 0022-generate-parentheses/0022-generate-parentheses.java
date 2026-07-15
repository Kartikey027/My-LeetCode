class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        int op=n,cl=n;
        String s="";
        pattern(s,op,cl);
        return ans;
    }
    public void pattern(String s,int op,int cl){
        if(op==0 && cl==0){
            ans.add(s);
        }
        else if(op==0){
            pattern(s+")",op,cl-1);
        }
        else if(op==cl){
            s+="(";
            op--;
            pattern(s,op,cl);
        }
        else if(op<cl){
            pattern(s+"(",op-1,cl);
            pattern(s+")",op,cl-1);
        }
        
    }
}