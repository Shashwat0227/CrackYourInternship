import java.util.*;
public class DFSGraph {
    public void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean [] visted, ArrayList<Integer> ans) {
        visted[v] = true;

        ans.add(v);

        for (Integer neighber: adj.get(v)) {
            if (!visted[neighber]) {
                dfs(neighber, adj, visted, ans);
            }
        }
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        ArrayList<Integer> al = new ArrayList<>();
        dfs(0, adj, vis, al);
        return al;
    }
}
