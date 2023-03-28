package recursion;

public class reverse_k_group {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode node=head;
        for(int i=0;i<k;i++)
        {
            if(node==null) return head;
            node=node.next;
        }
        ListNode new_head=reverse(head,node);
        head.next=reverseKGroup(node,k);
        return new_head;
    }

        ListNode reverse(ListNode first, ListNode last) {
        ListNode prev =last;
        while(first!=last)
        {
            ListNode temp=first.next;
            first.next=prev;
            prev=first;
            first=temp;
        }
        return prev;
    }
    
}
