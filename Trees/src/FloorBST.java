public class FloorBST {

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode (){};
        TreeNode (int data , TreeNode left , TreeNode right ){
            this.data=data;
            this.left = left;
            this.right = right;
        }

    }
    public static int floor(TreeNode root, int x) {
        // Code here
        int smaller =-1;
        if(root == null) return smaller;

        if(root.data > x){
            smaller = floor(root.left , x);
        }else {
            smaller = floor(root.right,x);
            if(smaller == -1){
                smaller = root.data;
                return root.data;
            }
        }
        return smaller;

    }

    public static void main(String[] args) {

    }
}
