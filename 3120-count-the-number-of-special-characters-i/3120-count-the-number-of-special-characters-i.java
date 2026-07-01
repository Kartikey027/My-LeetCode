class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> upper=new HashSet<>();
        Set<Character> lower=new HashSet<>();
        int c=0;
        for(char ch:word.toCharArray()){
            if(Character.isUpperCase(ch)){
                upper.add(ch);
            }else{
                lower.add(ch);
            }
        }
        for(char ch:lower){
            if(upper.contains(Character.toUpperCase(ch))){
                c++;
            }
        }
        return c;
    }
}