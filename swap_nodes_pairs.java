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

public class swap_nodes_pairs {
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode newHead = head.next;       
        head.next=swapPairs(newHead.next);
        newHead.next=head;
        return newHead;
        
    } 
}
