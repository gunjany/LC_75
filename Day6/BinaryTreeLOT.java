package Day6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLOT {

// * Definition for a binary tree node.
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
        List<List<Integer>> ans = new ArrayList<>();

        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> treeList = new ArrayList<>();
            Queue<TreeNode> treeQueue = new LinkedList<>();
            
            if(root == null) { return treeList; }
            
            treeQueue.add(root);
            
            while(!treeQueue.isEmpty()) {
                List<Integer> levelList = new ArrayList<>();
                int levelSize = treeQueue.size();
                
                for(int i = 0; i < levelSize; i++) {
                    TreeNode curNode = treeQueue.poll();
                    if(curNode == null) { continue; }
                    levelList.add(curNode.val);
                    treeQueue.add(curNode.left);
                    treeQueue.add(curNode.right);
                }
                
                if(!levelList.isEmpty()) { treeList.add(levelList); }
            }
            return treeList;
        
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        System.out.println(solution.levelOrder(root));
    
    }
}
