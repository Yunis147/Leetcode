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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode mid = new ListNode(-1,head);
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            cur = cur.next.next;
            mid=mid.next;
        }
        mid.next=mid.next.next;
        return head;
    }
}