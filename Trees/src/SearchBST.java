import java.util.Arrays;

public class SearchBST {

    class TreeNode {
        int val ;
        TreeNode left;
        TreeNode right;
         TreeNode () {}
        TreeNode(int val , TreeNode left , TreeNode right) {
         this.val = val;
         this.left = left ;
          this.right = right;
     }
    }
     public TreeNode createNewNode(int val){
        TreeNode a = new TreeNode();
        a.val = val;
        a.left = null;
        a.right =null;
        return a;
     }

    public TreeNode searchBinaryST(TreeNode root , int val){
        TreeNode curr = new TreeNode();
        if (root == null) return null;
        if(root.val == val ) return root;

        if (root.val > val ){
            curr = searchBinaryST(root.left,val);
        }
        else {
            curr = searchBinaryST(root.right,val);
        }
    return curr;
    }
     public TreeNode insert (TreeNode root ,int val){
        if(root == null)
        return createNewNode(val);

        if(root.val<val){
            root.right = insert(root.right,val);
        }else {
            root.left = insert(root.left,val);
        }
     return root;
     }

    public static void main(String[] args) {
        SearchBST search = new SearchBST();
       //4,2,7,1,3

        TreeNode root = null;
        root =search.insert(root,4);
        root =search.insert(root,2);
        root = search.insert(root,7);
        root = search.insert(root,1);
        root = search.insert(root,3);

      int val = 7;
      TreeNode curr = search.searchBinaryST(root,val);
        System.out.println(Arrays.toString(new TreeNode[]{curr}));

    }
}
