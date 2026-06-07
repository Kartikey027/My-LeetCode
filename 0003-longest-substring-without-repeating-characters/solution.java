class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        Set <Character> set=new HashSet<>();
        int len=0,max=0;
        while(right<s.length()){
            if(set.contains(s.charAt(right))==false){
                set.add(s.charAt(right));
                len++;
                max=Math.max(len,max);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                len--;
                left++;
            }
        }
        return max;
    }
}
