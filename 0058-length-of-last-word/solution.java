class Solution {
    public int lengthOfLastWord(String s) {
        int i,f;
        f=0;
        for(i=s.length()-1;i>0;i--)
        {
            if(s.charAt(i)!=' ' && s.charAt(i-1)==' ')
            {
                f=i;
                break;
            }
        }
        String temp=s.substring(f).trim();
        return temp.length();
    }
}
