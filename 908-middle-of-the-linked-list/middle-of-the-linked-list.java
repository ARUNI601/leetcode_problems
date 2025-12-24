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
class Solution 
{
    public ListNode middleNode(ListNode head)
    {
        if(head!=null)
        {
            ListNode temp=head;
            int c=0;
            while(temp!=null)
            {
                c++;
                temp=temp.next;
            }
            int d=c/2;
            int i=0;
            ListNode curr=head;
            while(i<d)
            {
                curr=curr.next;
                i++;
            }
            return curr;
        }
        else
        {
            return null;
        }
    }
}