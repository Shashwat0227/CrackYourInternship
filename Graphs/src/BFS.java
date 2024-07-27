import java.util.*;
public class BFS {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> t=new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        // visited
        boolean visited[] = new boolean[V+1];
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            Integer node=q.poll();
            t.add(node);
            for(Integer i:adj.get(node)){
                if(visited[i]==false){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        return t;
    }
}
