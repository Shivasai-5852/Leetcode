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
        if(head == null)    return head;
        ListNode temp = head;
        int cnt = 0;
        while(temp != null)
        {
            cnt++;
            temp = temp.next;
        }
        k = k % cnt;
        if(k == 0)
        {
            return head;
        }
        ListNode anTemp = head;
        for(int i = 1; i < cnt - k; i++)
        {
            anTemp = anTemp.next;
        }
        ListNode temp2 = anTemp.next;
        anTemp.next = null;
        ListNode dum = temp2;
        while(dum != null && dum.next != null)
        {
            dum = dum.next;
        }
        dum.next = head;
        return temp2;
    }
}