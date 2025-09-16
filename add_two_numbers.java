// O(n) solution i.e. O(max(N,M))
public /**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode() {}
*     ListNode(int val) { this.val = val; }
*     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
*/
class add_two_numbers {
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummyHead = new ListNode(0);
       ListNode tail = dummyHead;
       // empty list with tail pointing to head
       int carry = 0; // for carry value during sum

       while (l1 != null || l2 != null || carry != 0) {
           int d1 = (l1 != null) ? l1.val : 0; // stores list 1 digit
           int d2 = (l2 != null) ? l2.val : 0; // stores list 2 digit

           int sum = d1 + d2 + carry;
           int digit = sum % 10;
           carry = sum / 10;

           // adding new node with the required digit
           ListNode newNode = new ListNode(digit);
           tail.next = newNode;
           tail = tail.next;

           // traversing next elements of lists
           l1 = (l1 != null) ? l1.next : null;
           l2 = (l2 != null) ? l2.next : null;
       }

       ListNode answer = dummyHead.next; // points to our actual list head
       dummyHead.next = null;
       return answer;
   }
}
