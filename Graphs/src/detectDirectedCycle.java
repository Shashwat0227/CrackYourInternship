import java.util.*;
public class detectDirectedCycle {
    public boolean checkdfs(int node, ArrayList<ArrayList<Integer>> adj , int []vis , int []pathvis){
        vis[node]=1;
        pathvis[node]=1;
        for(int it: adj.get(node)){
            if(vis[it]==0){
                if(checkdfs(it,adj,vis,pathvis)==true) return true;
            }
            else if (pathvis[it]==1) return true;
        }

        pathvis[node]=0;
        return false;

    }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int []vis = new int[V];
        int []path = new int[V];
        for(int i =0; i< V ; i++){
            if(vis[i]==0){
                if(checkdfs(i,adj,vis,path)==true)
                    return true;
            }
        }
        return false;

    }
}
