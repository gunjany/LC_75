package Day3;


public class MergeSortedList {

//Definition for singly-linked list.
public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public static void append(ListNode head, int new_data)
    {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        ListNode new_ListNode = new ListNode(new_data);
 
        /* 4. If the Linked List is empty, then make the
              new ListNode as head */
        if (head == null)
        {
            head = new ListNode(new_data);
            return;
        }
 
        /* 4. This new ListNode is going to be the last ListNode, so
              make next of it as null */
        new_ListNode.next = null;
 
        /* 5. Else traverse till the last ListNode */
        ListNode last = head;
        while (last.next != null)
            last = last.next;
 
        /* 6. Change the next of last ListNode */
        last.next = new_ListNode;
        return;
    }

static class Solution {
    public ListNode  mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sortedList = new ListNode();
        if(list1 == null)
            return list2;
        else if(list2 == null)
            return list1;

        try{

            while(list1 != null && list2 != null){
                if(list1.val<=list2.val)
                {    
                    append(sortedList, list1.val);
                    if(list1.val == list2.val)
                    {    
                        append(sortedList, list2.val);
                        
                        list1 = list1.next;
                        list2 = list2.next;
                    }
                    else 
                        list1 = list1.next;
                }
                    
                else if(list2.val < list1.val){
                    append(sortedList, list2.val);
                    list2 = list2.next;

                }
            }
        }catch(NullPointerException nullPointerException){
        System.out.println("MergeSortedList.Solution.mergeTwoLists()");
        }   
    
        if(list1==null){
            while(list2 != null){
                append(sortedList, list2.val);
                list2 = list2.next;
            }
        }
        else if(list2==null){
            while(list1 != null){
                append(sortedList, list1.val);
                list1 = list1.next;
            }
        }
        return sortedList.next;
        
    }
}

public static void printList(ListNode head)
    {
        ListNode tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.val+" ");
            tnode = tnode.next;
        }
    }

public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode list1 = new ListNode();
    list1= list1.next;
    // ListNode list1 = new ListNode(1);
    // append(list1, 3);
    // append(list1, 4);
    printList(list1);
    ListNode list2 = new ListNode(1);
    // ListNode list2 = new ListNode(1);
    // append(list2, 2);
    // append(list2, 4); 
    System.out.println();
    printList(list2);  
    System.out.println(); 
    ListNode sortedList = solution.mergeTwoLists(list1, list2);
    //sortedList = solution.mergeTwoLists(list1, list2);
    printList(sortedList);
}
    
}
