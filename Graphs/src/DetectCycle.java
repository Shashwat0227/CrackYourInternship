import java.util.*;
public class DetectCycle {
    class Pair{
        int first;
        int second;
        Pair(int frst,int scnd){
            this.first = frst;
            this.second = scnd;
        }
    }

    public boolean Check(int src , int V , ArrayList<ArrayList<Integer>> adj , boolean[]vis){

        vis[src]= true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,-1));
        while(!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();
            for(Integer it :adj.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(new Pair(it,node));

                }else if (parent!=it){
                    return true;
                }
            }


        }
        return false;

    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[]= new boolean[V];
        for(int i =0 ; i< V; i++) vis[i]=false;
        for(int i=0; i< V; i++ ){
            if(vis[i]==false){
                if(Check(i,V,adj,vis)) return true;
            }
        }
        return false;
    }
}
