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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        int c =0 ;

        ListNode res = new ListNode(0);
            ListNode curr = res;

        while(t1 != null || t2 != null){

            int v1 = (t1!= null)?t1.val:0;
            int v2 = (t2!= null)?t2.val:0;

            int total = v1+v2+c;
            int sum = total % 10;
            c = total / 10;
            
            curr.next = new ListNode(sum);
            curr = curr.next;

        
            if(t1 != null)
            t1 = t1.next;

            if(t2 != null)
            t2 = t2.next;
        }

        if(c != 0){
            curr.next = new ListNode(c);
        }

        return res.next;
    }
}
