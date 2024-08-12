public class CreateBST {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

       TreeNode(){};
        TreeNode (int val){};
        TreeNode (int data , TreeNode left , TreeNode right){
            this.data=data;
            this.left = left;
            this.right = right;
        }
    }
public void CreateBST(TreeNode root , int val){
        if (root.data == val ) return;

    if(root.data> val){
        if(root.left!=null){
            CreateBST(root.left,val);
        }else {
            root.left = new TreeNode(val);
            return;
        }
    }else {
        if(root.right != null){
            CreateBST(root.right , val);
        }else {
            root.right = new TreeNode(val);
            return;
        }
    }
    }
public TreeNode insert(TreeNode root, int val){
        if(root.data== val) return root;
        CreateBST(root,val);
        return root;
}

}
