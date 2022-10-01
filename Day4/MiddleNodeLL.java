package Day4;

import java.security.DrbgParameters.NextBytes;

public class MiddleNodeLL{

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //Append a new node
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
        public ListNode middleNode(ListNode head) {

            int length = 0;
            if(head == null)
                return head;

            head=head.next;
            ListNode p = head;
            while(p!= null){
                length++;
                p=p.next;
            }
            p=head;
            length /= 2;
            while(length-->0 && p!= null){
                p=p.next;
            }

            return p;            
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
        append(list1, 6);
        printList(solution.middleNode(list1));
    }
    
}


