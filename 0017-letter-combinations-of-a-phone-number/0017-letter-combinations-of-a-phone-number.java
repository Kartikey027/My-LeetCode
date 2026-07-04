class Solution {
    Map<Character,String> map=new HashMap<>();
    List<String> ans=new ArrayList<>();
    Solution(){
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return ans;
        }
        backtrack(0,"",digits);
        return ans;
    }
    public void backtrack(int idx,String curr,String digits){
        if(idx==digits.length()){
            ans.add(curr);
            return;
        }
        String lett=map.get(digits.charAt(idx));

        for(int i=0;i<lett.length();i++){
            char ch=lett.charAt(i);
            backtrack(idx+1,curr+ch,digits);
        }
    }
}