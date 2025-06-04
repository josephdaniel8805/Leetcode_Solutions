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
import java.math.BigInteger;
class Solution {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    //BigInteger Approach
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ptr=head;
        ListNode ptr1=ptr.next;
        while(ptr!=null && ptr1!=null){
            int gcd = BigInteger.valueOf(ptr.val).gcd(BigInteger.valueOf(ptr1.val)).intValue();
            ListNode gcdnode=new ListNode(gcd);
            gcdnode.next=ptr1;
            ptr.next=gcdnode;
            ptr=ptr1;
            ptr1=ptr1.next;
        }
        return head;
    }
}