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

public class merge_2sorted_list {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode result = new ListNode();
        ListNode head =result;

        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                result.next=new ListNode(list1.val);
                list1=list1.next;
            }
            else
            {
                result.next=new ListNode(list2.val);
                list2=list2.next;
            }
            result=result.next;
        }
        while(list1!=null)
        {
            result.next=new ListNode(list1.val);
            list1=list1.next;
            result=result.next;
        }
        while(list2!=null)
        {
            result.next=new ListNode(list2.val);
            list2=list2.next;
            result=result.next;
        }
        return head.next;
       
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode result = new ListNode();
        ListNode head =result;

        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                //result.next=new ListNode(list1.val);
                result.next=list1;
                list1=list1.next;
            }
            else
            {
                //result.next=new ListNode(list2.val);
                result.next=list2;
                list2=list2.next;
            }
            result=result.next;
        }
        if(list1!=null)
        {
            //result.next=new ListNode(list1.val);
            result.next=list1;
        }
        if(list2!=null)
        {
            result.next=list2;
        }
        return head.next;
       
    }
}
