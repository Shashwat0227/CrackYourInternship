public class CeilBST {
   class TreeNode {
      int data;
      TreeNode left;
      TreeNode right;

      TreeNode() {
      }

      ;

      TreeNode(int val, TreeNode left, TreeNode right) {
         this.data = val;
         this.left = left;
         this.right = right;

      }

   }

   public int CeilBinary(TreeNode root, int key) {
      int ceil = -1;
      if (root == null) {
         ceil = root.data;
         return ceil;
      }
      if (root.data > key) {
         ceil = CeilBinary(root.left, key);
         if (ceil == -1) return root.data;

      } else {
         ceil = CeilBinary(root.right, key);
      }


      return ceil;
   }
}
