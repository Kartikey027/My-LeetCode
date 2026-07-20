class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean v[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                v[i][j]=false;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(solve(i,j,board,word,0,v)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean solve(int r,int c,char b[][],String s,int x,boolean v[][]){
        if(v[r][c]) return false;
        if(x==s.length()-1) return b[r][c]==s.charAt(x);
        if(b[r][c]!=s.charAt(x)) return false;
        else{
            v[r][c]=true;
            boolean f1=false,f2=false,f3=false,f4=false;
            
            if(r-1>=0){
                f1=solve(r-1,c,b,s,x+1,v);
            }
            if(c-1>=0){
                f2=solve(r,c-1,b,s,x+1,v);
            }
            if(r+1<b.length){
                f3=solve(r+1,c,b,s,x+1,v);
            }
            if(c+1<b[0].length){
                f4=solve(r,c+1,b,s,x+1,v);
            }
            boolean ans= (f1||f2||f3||f4);
            v[r][c]=false;
            return ans;
        }
    }
}