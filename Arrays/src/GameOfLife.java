public class GameOfLife {
    public int value(int [][]mat , int row , int col){
        if(row<0 || col<0 || row>=mat.length ||col>=mat[0].length) return 0;
        if(mat[row][col]==0) return 0;
        return 1;
    }


    public int NCount(int [][]mat , int row , int col){
        int cnt =0;
        cnt+=value(mat,row+1,col);
        cnt+=value(mat,row,col+1);
        cnt+=value(mat,row-1,col);
        cnt+=value(mat,row,col-1);
        cnt+=value(mat,row+1,col+1);
        cnt+=value(mat,row-1,col-1);
        cnt+=value(mat,row+1,col-1);
        cnt+=value(mat,row-1,col+1);

        if(mat[row][col]==0){
            if(cnt==3) return 1;
            return 0;
        }else {
            if(cnt>3) return 0;
            if(cnt<2) return 0;
            return 1;
        }
    }
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int [][] mat = new int[m][n];
        for(int i =0; i< m ; i++){
            for(int j =0; j< n ; j++){
                mat[i][j]=board[i][j];
            }
        }
        for(int i =0; i< m ; i++){
            for(int j =0; j< n ;j++){
                board[i][j]=NCount(mat,i,j);
            }
        }

    }
}


