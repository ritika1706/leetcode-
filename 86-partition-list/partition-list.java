/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode partition(ListNode head, int x) {
        
ListNode temp= head;
ListNode left= new ListNode(0);
ListNode left1= left;
ListNode right=new ListNode(0);
ListNode right1= right;
if(head==null){
    return null;
}
while(temp!=null)
{
    if(temp.val< x){
ListNode ans= new ListNode(temp.val);
left1.next=ans;
left1=left1.next;
    }
    else{
ListNode ans1= new ListNode(temp.val);
right1.next=ans1;
right1=right1.next;

    }
    temp=temp.next;

}
left1.next=right.next;
return left.next;

    }
}