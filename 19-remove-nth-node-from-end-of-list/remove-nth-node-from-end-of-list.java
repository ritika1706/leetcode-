/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 **/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int c=0;
        if(head==null){
            return null;
        }
       
        while(curr!=null){
            c++;
            curr=curr.next;
        }
           if (c == n) {
            ListNode newhead = head.next;
            head = null;
            return newhead;
        }
        int m=c-n;
        curr=head;
          
        while(m>1){
     
      curr=curr.next;
m--;
    
        }
       

            curr.next=curr.next.next;
       
       

return head;



    }
}


