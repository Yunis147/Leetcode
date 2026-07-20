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
        if (head == null || head.next == null || k == 0)
            return head;
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            length++;
        }
        k %= length;
        if (k == 0)
            return head;
        int stepsToNewHead = length - k;
        ListNode prev = null;
        ListNode newHead = head;
        for (int i = 1; i <= stepsToNewHead; i++) {
            prev = newHead;
            newHead = newHead.next;
        }
        prev.next = null;
        ListNode tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        return newHead;
    }
}