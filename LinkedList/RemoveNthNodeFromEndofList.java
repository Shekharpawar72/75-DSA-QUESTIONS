package LinkedList;

public class RemoveNthNodeFromEndofList {
      // isme logic ye hai ki hum do pointer banayenge ek fast aur ek slow
      // step by step
      // fast pointer ko n steps aage badhayenge
      // fir dono pointer ko ek sath tab tak badhayenge jab tak fast pointer null na ho jaye
      // jab fast pointer null hoga to slow pointer uss node ke just previous pe h  
        // jise hume remove karna hai
    static class ListNode {
        int val;    
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); // Dummy node to handle edge cases
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the Nth node from the end
        slow.next = slow.next.next;

        return dummy.next; // Return the head of the modified list
    }
          
  
    
    public static void main(String[] args) {
            
            RemoveNthNodeFromEndofList solution = new RemoveNthNodeFromEndofList();
    
            // Creating a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
    
            int n = 2; // Example: Remove the 2nd node from the end
    
            // Removing the Nth node from the end of the linked list
            ListNode modifiedHead = solution.removeNthFromEnd(head, n);
    
            // Printing the modified linked list
            ListNode current = modifiedHead;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
    }
}
