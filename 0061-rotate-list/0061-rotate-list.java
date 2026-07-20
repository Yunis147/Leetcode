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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0) return head;
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        int s=0;
        while(temp!=null){
            temp=temp.next;
            s++;
        }
        k=k%s;
        if(k==0) return head;
        ListNode h=head;
        ListNode cur =head;
        ListNode p=null;
        for(int i=1;i<=(s-k);i++){
            p=cur;
            cur=cur.next;
        }
        p.next=null;
        ListNode t = cur;
        while(t.next!=null){
            t=t.next;
        }
        t.next=h;
        return cur;
    }
}