package LinkedList;
public class LinkedList{
    public static class ListNode {
        int val;
        ListNode next=null;
        public ListNode() {};
        ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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
}