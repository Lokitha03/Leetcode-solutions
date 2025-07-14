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
    public int getDecimalValue(ListNode head) {
        StringBuilder sb= new StringBuilder();
        ListNode cur=head;
        while(cur!=null){
            sb.append(cur.val);
            cur=cur.next;
        }
        String s=sb.toString();
        int num=Integer.parseInt(s,2);
        return num;
        
    }
}