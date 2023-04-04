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
      ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        prev.next = head;
        while(head != null) {
            if(head == slow) {
                prev.next = head.next;
            }else {
                prev = head;
            }
            head = head.next;
        }
        
        return dummy.next;
    }
}