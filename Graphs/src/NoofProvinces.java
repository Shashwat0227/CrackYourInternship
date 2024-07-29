public class NoofProvinces {
    public void dfs(int [][] isConnected , boolean[] visited ,int node){
        visited[node]=true;
        for(int i =0; i< isConnected.length; i++){
            if(isConnected[node][i]==1 && !visited[i]){
                dfs(isConnected,visited,i);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean []vis = new boolean[n];
        int cnt=0;
        for(int i =0; i< n ;i++){
            if(vis[i]==false){
                cnt++;
                dfs(isConnected,vis,i);
            }
        }
        return cnt;
    }
}
