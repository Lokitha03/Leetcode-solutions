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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-101);
        ListNode head=dummy;
        if(list1==null && list2==null)
            return list1;
        
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                ListNode newnode=new ListNode(list1.val);
                dummy.next=newnode;
                list1=list1.next;
            }
            else{
                ListNode newnode=new ListNode(list2.val);
                dummy.next=newnode;
                list2=list2.next;
            }
            dummy=dummy.next;
        }
        if(list1!=null){
            dummy.next=list1;
        }
        if(list2!=null){
            dummy.next=list2;
        }
        return head.next;
        
    }
}