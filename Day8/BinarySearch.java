package Day8;

import java.util.ArrayList;

public class BinarySearch {

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    static class Solution {
        boolean isRoot = true;
        boolean valid = true;
        ArrayList<Integer> sorted = new ArrayList<>();

        int root_val;
        public boolean isValidBST(TreeNode root) {
            if(root == null)
                return false;
            //inorder traversal left root right
            inOrderTraversal(root, sorted);
            for(int i=1; i<sorted.size(); i++){
                if(sorted.get(i)<=sorted.get(i-1))
                    return false;
            }
            return true;
        }
        
        void inOrderTraversal(TreeNode node, ArrayList<Integer> sorted){
            if(node == null)
                return;
            inOrderTraversal(node.left, sorted);
            sorted.add(node.val);
            inOrderTraversal(node.right, sorted);
        }
    }

    public static void main(String[] args) {
        
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(6);
        node.left.left = null;
        node.left.right = null;
        node.right.left = new TreeNode(3);
        node.right.right = new TreeNode(7);
        Solution solution = new Solution();
        System.out.println(solution.isValidBST(node));
    }
}

