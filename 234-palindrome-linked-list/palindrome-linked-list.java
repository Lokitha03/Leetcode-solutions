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
    public ListNode rev(ListNode head){
        ListNode cur=head;
        ListNode prev=null;
        ListNode next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode cur=head;
        int c=0;
        while(cur!=null){
            cur=cur.next;
            c++;
        }
        if(c==1)
            return true;
        int mid=c/2;
        ListNode half=head;
        ListNode halfbef=null;
        for(int i=0;i<mid;i++){
            if (i==mid-1)
            {
                halfbef = half;
            }
            half=half.next;
        }
//        System.out.println(halfbef.val);
        halfbef.next=null;
        ListNode n=rev(half);

        ListNode tmp=head;
        ListNode t=head;
        while(t!=null&&n!=null){
            if(t.val!=n.val){
                return false;
            }
            t=t.next;
            n=n.next;
        }
        return true;
    }
}