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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //1
        ListNode dummy = new ListNode(0,head);
        ListNode lPrev=dummy;
        ListNode cur = dummy.next;
        for(int i=0;i<left-1;i++){
            lPrev = cur;
            cur = cur.next;
        }
        //2
        ListNode prev=null;
        for(int i=0;i<(right-left+1);i++){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        //3
        lPrev.next.next = cur;
        lPrev.next=prev;

        return dummy.next;
    }
}