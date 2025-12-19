package LinkedList;

public class Detectcycle {
     
     public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
     
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by 1
            fast = fast.next.next;     // Move fast pointer by 2

            if (slow == fast) {        // Cycle detected
                return true;
            }
        }

        return false; // No cycle
    }
    public static void main(String[] args) {
        System.out.println("Detect Cycle in Linked List - Placeholder");

        // Example usage:
        Detectcycle solution = new Detectcycle();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);           
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Creating a cycle for testing

        boolean result = solution.hasCycle(head);
        System.out.println("Cycle detected: " + result);
        
    }
}
