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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode tempOdd = head;
        ListNode curr = dummy;
        while(tempOdd != null)
        {
            ListNode idx = new ListNode(tempOdd.val);
            curr.next = idx;
            curr = idx;
            if(tempOdd.next == null)   break;
            tempOdd = tempOdd.next.next;
        } 
        ListNode tempEven = head.next;
        while(tempEven != null)
        {
            ListNode idx = new ListNode(tempEven.val);
            curr.next = idx;
            curr = idx;
            if(tempEven.next == null)   break;
            tempEven = tempEven.next.next;
        } 
        return dummy.next;
    }
}