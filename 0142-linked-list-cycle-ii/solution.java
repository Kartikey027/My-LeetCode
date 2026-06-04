/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode a=head;
        ListNode b=head;

        while(a !=null && a.next !=null){
            a=a.next.next;
            b=b.next;
            if(a==b) {
                b=head;
                while(a!=b){
                    a=a.next;
                    b=b.next;
                }
                return b;
            }
        }
        return null;
    }
}
