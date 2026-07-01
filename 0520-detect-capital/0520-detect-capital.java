class Solution {
    public boolean detectCapitalUse(String word) {
        int cl=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                cl++;
            }
        }
        if(cl==word.length()){
            return true;
        }
        if(cl==0){
            return true;
        }
        if(cl==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}