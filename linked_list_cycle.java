/**
 * Definition for singly-linked list. */
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class linked_list_cycle {
    public boolean hasCycle(ListNode head) {
        // method 1 - using a hash set
        // if (head == null || head.next == null) {
        //     return false;
        // }
        // Set<ListNode> visited = new HashSet<>();
        // ListNode temp = head;
        // while (temp != null) {
        //     if (visited.contains(temp)) {
        //         return true;
        //     }
        //     visited.add(temp);
        //     temp = temp.next;
        // }
        // return false;

        // faster method 2 - using 2 pointers
        if (head == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // if i move 'slow' by 1 step and 'fast' by 2 steps,
        // if there's a cycle, they will eventually meet
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }
        
        return false;
    }
}