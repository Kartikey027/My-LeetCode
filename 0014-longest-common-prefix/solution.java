class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res=new StringBuilder();
        String longest, shortest;
        longest=shortest=strs[0];
        for(String s:strs ){
            if(shortest.compareTo(s)>0){
                shortest=s;
            }
            else if(longest.compareTo(s)<0){
                longest=s;
            }
        }
        for(int i=0;i<Math.min(longest.length(),shortest.length());i++){
            if(longest.charAt(i)!=shortest.charAt(i)){
                return res.toString();
            }
            res.append(longest.charAt(i));
        }
        return res.toString();
    }
}
