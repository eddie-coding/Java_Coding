import java.util.Comparator;
import java.util.PriorityQueue;

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


public class merge_ksorted_list {
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length==0) return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){

            public int compare(ListNode a, ListNode b){
                if(a.val<b.val) return -1;
                else if(a.val==b.val) return 0;
                else return 1;
            }
        });

        ListNode result = new ListNode();
        ListNode tail =result;

        for(ListNode node:lists)
        {
            if(node!=null) pq.add(node);
        }

        while(!pq.isEmpty())
        {
            tail.next=pq.poll();
            tail=tail.next;
            if(tail.next!=null) pq.add(tail.next);
        }
        return result.next;
        
        }

//2nd soultion

        public ListNode mergeKLists(ListNode[] lists) {

            if(lists.length==0) return null;
            return mergesort(0,lists.length-1,lists);      
        }
    
        public ListNode mergesort(int left, int right, ListNode[] lists)
        {
            if(left==right) return lists[left];
        
            int mid= left+ (right-left)/2;
            ListNode l=mergesort(left,mid,lists);
            ListNode r=mergesort(mid+1,right,lists);
            return merge(l,r);
        }
    
        public ListNode merge(ListNode a, ListNode b)
        {
            if(a==null) return b;
            if(b==null) return a;
    
            if(a.val<b.val)
            {
                a.next=merge(a.next,b);
                return a;
            }
            else{
                b.next=merge(a,b.next);
                return b;
            }
        }
    
}
