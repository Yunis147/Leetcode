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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode prev=dummy;
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            ListNode second = cur.next;
            ListNode nxtPair = second.next;

            second.next=cur;
            cur.next=nxtPair;
            prev.next=second;

            prev=cur;
            cur=nxtPair;
        }
        return dummy.next;
    }
}