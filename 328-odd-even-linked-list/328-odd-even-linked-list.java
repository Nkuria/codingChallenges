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
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        
        ListNode temp_odd = odd;
        ListNode temp_even = even;
        
        int counter = 1;
        
        ListNode current = head;
        while(current != null) {
            if(counter % 2 == 0) {
                temp_even.next = current;
                temp_even = temp_even.next;
            }else {
                temp_odd.next = current;
                temp_odd = temp_odd.next;
            }
            current = current.next;
            counter++;
        }
        temp_even.next = null;
        temp_odd.next = even.next;
        
        return odd.next;
        
    }
}