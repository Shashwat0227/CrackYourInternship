public class LCATREE {
    class TreeNode {
        int data ;
        TreeNode left;
        TreeNode right;

        TreeNode (){};
        TreeNode(int data ){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
   public TreeNode lowestAncestor(TreeNode root , TreeNode p , TreeNode q){
        if(root == null || root == p || root == q ) return root;

        TreeNode leftChild = lowestAncestor(root.left , p , q);
        TreeNode rightChild = lowestAncestor(root.right , p , q);
        if (leftChild== null) return rightChild;
        else if(rightChild== null) return leftChild;
        else {
            return root;
        }
   }
}
