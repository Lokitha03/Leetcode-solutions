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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode dummy=new ListNode(-1);
        ListNode head=dummy;
        int c=0;
        while(l1!=null ||l2!=null){
            int f=(l1!=null) ? l1.val : 0;
            int l=(l2!=null)?l2.val:0;
            int total=f+l+c;
            c=total/10;
            total=total%10;
            ListNode res=new ListNode(total);
            dummy.next=res;
            dummy=dummy.next;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        if(c>0){
            dummy.next=new ListNode(c);
        }
        return head.next;
        
    }
}