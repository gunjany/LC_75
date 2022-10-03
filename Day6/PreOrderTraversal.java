package Day6;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

    static class Node {
        public int val;
        public List<Node> children = new ArrayList<>();
    
        public Node() {}
    
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    
    static class Solution {
        List<Integer> ans = new ArrayList<>();
        
        public List<Integer> preorder(Node root) {
            if(root == null) return ans;
            ans.add(root.val);
            for(Node child: root.children)
                preorder(child);
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Node root = new Node(1);
        (root.children).add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));
        System.out.println(solution.preorder(root));

    }
    
}
