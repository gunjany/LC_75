package Day3;

public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //Add Nodes in Linked List
    public static void append(ListNode head, int new_data)
        {
            ListNode new_ListNode = new ListNode(new_data);
     
            if (head == null)
            {
                head = new ListNode(new_data);
                return;
            }

            new_ListNode.next = null;
     
            ListNode last = head;
            while (last.next != null)
                last = last.next;
     
            last.next = new_ListNode;
            return;
        }

    //Print Linked List
    public static void printList(ListNode head)
        {
            ListNode tnode = head;
            while (tnode != null)
            {
                System.out.print(tnode.val+" ");
                tnode = tnode.next;
            }
        }
    static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode reverseList = new ListNode();

            reverseList = head;

            if(head == null){
                return head;
            }

            ListNode p,q,r;
            r = null;
            p = head;
            q= head.next;
            while(q!= null){
                p.next = r;
                r= p;
                p = q;
                q= q.next;
            }

            p.next = r;
            reverseList = p;
            return reverseList;            
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1 = new ListNode();
        append(list1, 1);
        append(list1, 2);
        append(list1, 3);
        append(list1, 4);
        append(list1, 5);
        printList(solution.reverseList(list1.next));
    }
}
