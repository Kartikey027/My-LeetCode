class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten=0,five=0;
        for(int i:bills){
            if(i==5){
                five++;
            }else if(i==10){
                if(five==0){
                    return false;
                }else{
                    five--;
                    ten++;
                }
            }
            else{
                if(ten>=1 && five>=1){
                    ten--;
                    five--;
                }
                else if(ten==0 && five>=3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}