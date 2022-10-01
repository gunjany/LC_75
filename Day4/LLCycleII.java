package Day4;
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
 
public class LLCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return head;
        ListNode p = head;
        ListNode q = head.next;
        int loopLen = 0;
        if(q== null)
         return null;
        while(q!=null && q.next !=null){
            //if(p.next != null && q.next!=null && q.next.next != null)
            {
                p = p.next;
                q = q.next.next;
            }
            if(p==q)
                break;
            
        }
        if(q==null || q.next==null || p==null)
            return null;
        else
        {
            q = q.next;
            loopLen++;
            while(p!=q){
                q = q.next;
                loopLen++;
            }
            p = head;
            q = head;
            for(int i=0; i<loopLen; i++){
                p = p.next;
            }
        
            while(p!= q ){
                p = p.next;
                q= q.next;
            }        
        return q;
        }
    }
}