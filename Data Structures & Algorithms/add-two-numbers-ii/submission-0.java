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
   
        
private ListNode  rev (ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}
 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1= rev(l1);
        l2=rev(l2);
        ListNode Dummy = new ListNode(0);
        ListNode s = Dummy;
        int carry=0;
        while (l1 != null || l2 != null || carry != 0){
            int val1 = (l1!=null) ? l1.val :0;
            int val2 = (l2!=null) ? l2.val :0;
            int sum = val1+val2+carry;
             carry = sum/10;
            int digit = sum%10;

            s.next = new ListNode (sum%10);
            s=s.next;
            if (l1!= null) l1=l1.next;
            if (l2!= null) l2=l2.next;

       

             
        }
 return  rev(Dummy.next);

    }
}