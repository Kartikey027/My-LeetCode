class Solution {
    public boolean wordPattern(String pattern, String s) {
        String a[]=s.split(" ");
        if(a.length!=pattern.length()){
            return false;
        }
        Map<Character,String> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!a[i].equals(map.get(ch))){
                    return false;
                }
            }
            else if(map.containsValue(a[i])){
                    return false;
                }
                else{
                    map.put(ch,a[i]);
                }
        }
        return true;
    }
}