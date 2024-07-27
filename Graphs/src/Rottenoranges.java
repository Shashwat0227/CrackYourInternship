import java.util.*;
public class Rottenoranges {
    class Pair {
        int row;
        int col ;
        int tim;

        Pair(int _row , int _col , int _tim){
            this.row = _row;
            this.col = _col;
            this.tim = _tim;

        }
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [][] vis = new int[n][m];
        int cntfrsh=0;
        Queue<Pair> q = new LinkedList<>();
        for(int i =0 ; i<n ; i++){
            for(int j =0 ; j<m ; j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }else {
                    vis[i][j]=0;
                }
                if(grid[i][j]==1) cntfrsh++;
            }
        }
        int tm =0;
        int draw[] ={-1,0,+1,0};
        int dcol[]={0,1,0,-1};
        int cnt =0;
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().tim;
            tm = Math.max(tm,t);
            q.remove();
            for(int i =0; i< 4 ; i++){
                int nrow = r+draw[i];
                int ncol = c+dcol[i];
                if(ncol>=0 && ncol<m  && nrow >=0 && nrow <n && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    cnt++;

                }
            }
        }
        if(cnt != cntfrsh) return -1;
        return tm;


    }
}
