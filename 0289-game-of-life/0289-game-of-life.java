class Solution {
    public int check(int[][] board, int i, int j, int m, int n){
      int lives=0;
      for(int x=Math.max(i-1,0);x<=Math.min(i+1,m);x++){
          for(int y=Math.max(j-1,0);y<=Math.min(j+1,n);y++){
              lives += board[x][y] & 1;
          }
      }
      lives -= board[i][j] & 1;
      return lives;

    }   

    public void gameOfLife(int[][] board) {
       
        int m = board.length-1;
        int n = board[0].length-1;

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                int lives = check(board, i, j, m , n);

                if(board[i][j]==1 && (lives==2 || lives==3)){
                    board[i][j] = 3;
                }
                if(board[i][j]==0 && lives==3){
                    board[i][j] = 2;    
                }
            }
        }

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                board[i][j] = board[i][j]>>1;
            }
        }

    }
}