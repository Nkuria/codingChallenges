/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode current = head;
        ListNode temp;
        ListNode reversed = null;
        
        while(current != null) {
            temp = current.next;
            current.next  = reversed;
            reversed = current;
            current = temp;
            
            
        }
            
            
        
     
        
        return reversed;
        }
}