package LinkedList;

public class Removefromlast {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class LinkedList {
        ListNode head;
        ListNode tail;

        public void removeFromLast() {
            if (head == null) return;

            if (head.next == null) {
                head = null;
                tail = null;
                return;
            }

            ListNode prev = head;
            while (prev.next.next != null) {
                prev = prev.next;
            }

            prev.next = null;
            tail = prev;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new ListNode(10);
        list.head.next = new ListNode(20);
        list.head.next.next = new ListNode(30);
        list.tail = list.head.next.next;
        System.out.println("Original List:");
        ListNode current = list.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        list.removeFromLast();
        System.out.println("\nList after removing last element:");
        current = list.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        

    }
}
