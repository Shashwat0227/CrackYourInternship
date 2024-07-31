import java.util.*;
public class CourseSchedular {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n =numCourses;
        List<Integer>[] adj = new List[numCourses];
        int[]indegree = new int[numCourses];
        List<Integer> ans = new ArrayList<>();

        for(int []pair : prerequisites){
            int course = pair[0];
            int prerequisite = pair[1];
            if(adj[prerequisite]==null){
                adj[prerequisite]= new ArrayList<>();
            }
            adj[prerequisite].add(course);
            indegree[course]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0; i< n ; i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int curr = queue.poll();
            ans.add(curr);
            if(adj[curr]!=null){
                for(int next : adj[curr]){
                    indegree[next]--;
                    if(indegree[next]==0){
                        queue.add(next);
                    }
                }
            }
        }
        return ans.size()==n;
    }
}
