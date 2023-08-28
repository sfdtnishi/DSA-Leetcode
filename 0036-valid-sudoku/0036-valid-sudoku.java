class Solution {
    public boolean ischeck(char[][] board, int i, int j){
        
        int k=j;
        while((k++)<board.length-1){
            if(board[i][j]==board[i][k] && board[i][k]!='.'){
                return false;
            }
        }
     
        k=j;
        while((k--)>0){
            if(board[i][j]==board[i][k] && board[i][k]!='.'){
                return false;
            }
        }
        k=i;
      
        while((k++)<board.length-1 ){
            if(board[i][j]==board[k][j] && board[k][j]!='.'){
                return false;
            }
        }
        k=i;
        
        while((k--)>0){
            if(board[i][j]==board[k][j] && board[k][j]!='.'){
                return false;
            }
        }
     
        int m = (i/3)*3;
        int n = (j/3)*3;
        for(int x=m;x<m+3;x++){
            for(int y=n;y<n+3;y++){
                if((x!=i && y!=j) && board[i][j]==board[x][y] && board[x][y]!='.'){
                return false;
            }
            }
        }
        
    return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(ischeck(board, i,j)==false){
                    return false;
                }
            }
        }
        return true;
    }
}