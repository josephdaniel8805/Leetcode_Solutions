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
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ptr=head;
        ListNode ptr1=ptr.next;
        while(ptr!=null && ptr1!=null){
            int gcd = gcd(ptr.val,ptr1.val);
            ListNode gcdnode=new ListNode(gcd);
            gcdnode.next=ptr1;
            ptr.next=gcdnode;
            ptr=ptr1;
            ptr1=ptr1.next;
        }
        return head;
    }
    private int gcd(int a, int b) {
        while(b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}