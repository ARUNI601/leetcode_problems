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
        if(head == null || head.next == null)
        {
            return null;
        } 
        ListNode sl = head;
        ListNode fa = head.next.next;
        while(fa != null && fa.next != null)
        {
            sl = sl.next;
            fa = fa.next.next;
        }
        sl.next = sl.next.next;
        return head;
    }
}