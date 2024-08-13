import java.util.*;
public class NodesAtaDistanceK {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (){};
        TreeNode (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }

    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,TreeNode> parent = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0; i< size ; i++){
                TreeNode node = q.poll();

                if(node.left!=null) {
                    parent.put(node.left.val,node);
                    q.add(node.left);
                }

                if(node.right!=null) {
                    parent.put(node.right.val,node);
                    q.add(node.right);
                }
            }
        }

        Map<Integer,Integer> vis = new HashMap<>();
        q.add(target);
        while(k>0 && !q.isEmpty()){
            int size = q.size();
            for(int i =0; i< size ; i++){
                TreeNode top = q.poll();
                vis.put(top.val,1);

                if(top.left!=null && !vis.containsKey(top.left.val)){
                    q.add(top.left);
                }
                if(top.right!=null && !vis.containsKey(top.right.val)){
                    q.add(top.right);
                }
                if(parent.containsKey(top.val) && !vis.containsKey(parent.get(top.val).val)){
                    q.add(parent.get(top.val));
                }
            }
            k--;
        }
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
}
