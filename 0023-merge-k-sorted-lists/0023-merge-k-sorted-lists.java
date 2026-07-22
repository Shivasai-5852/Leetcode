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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < lists.length; i++)
        {
            ListNode curr = lists[i];
            while(curr != null)
            {
                list.add(curr.val);
                curr = curr.next;
            }
        }
        Collections.sort(list);
        if(list.isEmpty())  return null;
        ListNode dummy = new ListNode(list.get(0));
        ListNode temp = dummy;
        for(int i = 1; i < list.size(); i++)
        {
            ListNode el = new ListNode(list.get(i));
            temp.next = el;
            temp = temp.next;
        }
        return dummy;
    }
}