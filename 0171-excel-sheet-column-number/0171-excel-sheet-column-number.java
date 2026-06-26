class Solution {
    public int titleToNumber(String ct) {
        Map<Character,Integer> map=new HashMap<>();
        char c='A';
        for(int i=1;i<=26;i++){
            map.put(c,i);
            c+=1;
        }
        int num=0;
        for(int i=0;i<ct.length();i++){
            char ch=ct.charAt(i);
            num+=map.get(ch)*Math.pow(26,(ct.length()-1-i));
        }
        return num;
    }
}